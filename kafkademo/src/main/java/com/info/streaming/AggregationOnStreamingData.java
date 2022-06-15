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
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;

public class AggregationOnStreamingData {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		final Properties properties = new Properties();
		properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "Aggregation-Id");
		properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
		
		properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		
		// Creating Streaming Builder to read streaming data
		final StreamsBuilder builder = new StreamsBuilder();
		
		// read streaming data from the topic and group by key 
		KStream<String, String> source = builder.stream("agg-input-topic");
		KGroupedStream<String, String> groupedStream = source.groupByKey();
		
		// performing aggregation on grouped data
		KTable<String, Integer> aggregatedData = groupedStream.aggregate(
				() -> 0, 
				(aggKey, newValue, aggValue) -> aggValue + newValue.length(), 
				Materialized.with(Serdes.String(), Serdes.Integer())
				);
		
		// streaming aggregation to a kafka-cluster topic
		aggregatedData.toStream().to("agg-output-topic1", Produced.with(Serdes.String(), Serdes.Integer()));
		
		
		KTable<String, Long> countData = groupedStream.count(Materialized.with(Serdes.String(), Serdes.Long()));
		countData.toStream().to("agg-output-topic2", Produced.with(Serdes.String(), Serdes.Long()));
		
		Topology topology = builder.build();
		System.out.println(topology.describe());
		
		KafkaStreams kafkaStreams = new KafkaStreams(topology, properties);
		kafkaStreams.start();
		
	}
	
}
