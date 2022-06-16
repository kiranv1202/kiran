package com.info.streaming;

import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Produced;

public class AggregationDemo {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "aggregationdemo");		// consumer group Id
		properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		
		StreamsBuilder builder = new StreamsBuilder();
		KStream<String, String> kStream = builder.stream("agg-input-topic");
		KGroupedStream<String, String> kGroupedStream = kStream.groupByKey();
		
		KTable<String, Integer> aggResult = kGroupedStream.aggregate(
				() -> 0,
				(aggKey, newValue, aggValue) -> aggValue + newValue.length()
				);
		
		aggResult.toStream().to("agg-output-topic", Produced.with(Serdes.String(), Serdes.Integer()));
		
		
		KTable<String, Long> countResult = kGroupedStream.count();
		countResult.toStream().to("count-output-topic", Produced.with(Serdes.String(), Serdes.Long()));
		
		KTable<String, String> reduceResult = kGroupedStream.reduce((leftValue, rightValue) -> leftValue + " "+ rightValue);
		reduceResult.toStream().to("reduce-output-topic");
		
		Topology topology = builder.build();
		KafkaStreams kafkaStreams = new KafkaStreams(topology, properties);
		kafkaStreams.start();
		
		Runtime.getRuntime().addShutdownHook(new Thread("streams-shutdown") {
			
			@Override
			public void run() {
				kafkaStreams.close();
			}
		});
	}

}
