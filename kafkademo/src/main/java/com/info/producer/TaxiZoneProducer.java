package com.info.producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import com.info.model.TaxiZone;
import com.info.model.ZoneSerializer;
import com.info.utils.DUtils;

public class TaxiZoneProducer {
	
	static KafkaProducer<String, TaxiZone> producer;
	
	public static void createProducer() {
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "Client-1");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ZoneSerializer.class);
		
		producer = new KafkaProducer<String, TaxiZone>(properties);
	}
	
	public static void produceMessage(String key, TaxiZone value)throws InterruptedException {
		createProducer();
		ProducerRecord<String, TaxiZone> record = new ProducerRecord<String, TaxiZone>("zone", key, value);
		producer.send(record);
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) {
		try {
			Connection connection = DUtils.getConnection();
			String query =  "select * from taxizone";
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {	//256
				TaxiZone taxiZone = new TaxiZone();
				taxiZone.setLocationId(resultSet.getInt("locationid"));
				taxiZone.setBorough(resultSet.getString("borough"));
				taxiZone.setZone(resultSet.getString("zone"));
				taxiZone.setServiceZone(resultSet.getString("service_zone"));
				
				System.out.println(taxiZone);
				produceMessage(taxiZone.getLocationId()+"", taxiZone);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
