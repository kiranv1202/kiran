package com.info.streaming;

import java.time.Duration;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.JoinWindows;
import org.apache.kafka.streams.kstream.KStream;

public class JoinsOnStreamingData {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		final Properties properties = new Properties();
		properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "Aggregation-Id");
		properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
		
		properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		
		StreamsBuilder builder = new StreamsBuilder();
		
		KStream<String, String> leftSource = builder.stream("topic1");
		KStream<String, String> rightSource = builder.stream("topic2");
		
		// inner join
		KStream<String, String> innerJoin = leftSource.join(
				rightSource, 
				(leftValue, rightValue) -> "Left = "+leftValue+", Right = "+rightValue, 
				JoinWindows.of(Duration.ofMinutes(5)));
		
		innerJoin.to("innerJoinTopic");
		
		// Left Join
		KStream<String, String> leftJoin = leftSource.leftJoin(
				rightSource,
				(leftValue, rightValue) -> "Left = "+leftValue+", Right = "+rightValue, 
				JoinWindows.of(Duration.ofMinutes(5)));
		
		leftJoin.to("leftJoinTopic");
		
		
		// Outer Join
		KStream<String, String> outerJoin = leftSource.outerJoin(
				rightSource,
				(leftValue, rightValue) -> "Left = "+leftValue+", Right = "+rightValue, 
				JoinWindows.of(Duration.ofMinutes(5)));
		
		outerJoin.to("outerJoinTopic");

		Topology topology = builder.build();
		KafkaStreams kafkaStreams = new KafkaStreams(topology, properties);
		
		kafkaStreams.start();
		
		
	}
}
