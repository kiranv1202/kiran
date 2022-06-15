package com.info.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class CustomProducer {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)throws InterruptedException {
		
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "Client-1");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
		
		String topicname = "customtopic";
		
		ProducerRecord<String, String> record = null;
		
		for (int index = 1; index <= 25; index++) {
			
			record = new ProducerRecord<String, String>(topicname, 1, Integer.toString(index), "Message: "+ Integer.toString(index));
			kafkaProducer.send(record);
			
			System.out.println(index+" record written to the topic");
			Thread.sleep(1000);
		}
		
		kafkaProducer.close();
		
	}

}
