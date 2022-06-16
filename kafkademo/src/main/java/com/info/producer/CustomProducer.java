package com.info.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class CustomProducer {

	public static void main(String[] args) throws InterruptedException {
		
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "Producer-1");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		Producer<String, String> producer =  new KafkaProducer<String, String>(properties);
		
		String topicName = "table-topic";
		
		ProducerRecord<String, String> record = null;
		
		for (int index = 1; index <= 20; index++) {
			
			// generating a message
			String message = "12 X "+index+" = "+(12 * index);
			System.out.println(message);
			
			// creating a record
			record = new ProducerRecord<String, String>(topicName, Integer.toString(index), message);
			
			// sending message to the broker
			producer.send(record);
			
			Thread.sleep(1000);
		}
		
		producer.close();
		
	}
	
}
