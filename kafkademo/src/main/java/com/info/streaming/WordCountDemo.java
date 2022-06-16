package com.info.streaming;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Printed;

public class WordCountDemo {

	public static void main(String[] args) {
	
		Properties properties = new Properties();
		properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "wordcount");		// consumer group Id
		properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		
		StreamsBuilder builder = new StreamsBuilder();
		KStream<String, String> kStream1 = builder.stream("WordCountTopic");
	
		KStream<String, String> kStream2 = kStream1.flatMapValues((textLine) -> Arrays.asList(textLine.toLowerCase().split(" ")));
		// kStream2.print(Printed.<String, String>toSysOut().withLabel("WC"));
		
		KGroupedStream<String, String> kGroupStream = kStream2.groupBy((key, word) -> word);
		System.out.println(kGroupStream.toString());
		
		KTable<String, Long> kTable = kGroupStream.count();
		kTable.toStream().print(Printed.<String, Long>toSysOut().withLabel("WCount"));
		
		Topology topology = builder.build();
		KafkaStreams kafkaStreams = new KafkaStreams(topology, properties);
		kafkaStreams.start();
		
		// callback... control+c
		Runtime.getRuntime().addShutdownHook(new Thread("streaming-shutdown") {
			public void run() {
				kafkaStreams.close();
			}
		});
		
	}
	
}
