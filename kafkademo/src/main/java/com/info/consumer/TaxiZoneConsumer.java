package com.info.consumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import com.info.model.TaxiZone;
import com.info.model.ZoneDeserializer;


public class TaxiZoneConsumer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, "taxi-consumer");
		properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
		properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "5000");
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ZoneDeserializer.class);

		KafkaConsumer<String,TaxiZone> kafkaConsumer = new KafkaConsumer<String, TaxiZone>(properties);
		
		String topicName = "zone";
		kafkaConsumer.subscribe(Collections.singletonList(topicName));
		
		while(true) {
			ConsumerRecords<String,TaxiZone> records = kafkaConsumer.poll(Duration.ofMillis(100));
			
			for (ConsumerRecord<String, TaxiZone> record : records) {
				System.out.println(record);
			}
		}
		
	}

}
