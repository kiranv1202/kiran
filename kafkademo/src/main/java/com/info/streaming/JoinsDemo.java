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

public class JoinsDemo {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "joinsdemo");		// consumer group Id
		properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
		properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
	
		StreamsBuilder builder = new StreamsBuilder();
		
		KStream<String, String> leftStream = builder.stream("left-input-topic");
		KStream<String, String> rightStream = builder.stream("right-input-topic");
		
		KStream<String, String> innerJoinStream = leftStream.join(
				rightStream,
				(leftValue, rightValue) -> "Left = "+leftValue+ ", Right = "+rightValue,
				JoinWindows.of(Duration.ofMinutes(5))
				);
		
		innerJoinStream.to("innerJoin-output-topic");	// writing inner-join output to the topic
		
		KStream<String, String> leftJoinStream = leftStream.leftJoin(
				rightStream,
				(leftValue, rightValue) -> "Left = "+leftValue+ ", Right = "+rightValue,
				JoinWindows.of(Duration.ofMinutes(5))
				);
		
		leftJoinStream.to("leftJoin-output-topic");
		
		KStream<String, String> outerJoinStream = leftStream.outerJoin(
				rightStream,
				(leftValue, rightValue) -> "Left = "+leftValue+ ", Right = "+rightValue,
				JoinWindows.of(Duration.ofMinutes(5))
				);
		
		outerJoinStream.to("outerJoin-output-topic");
		
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
