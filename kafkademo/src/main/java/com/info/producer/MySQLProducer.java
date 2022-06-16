package com.info.producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import com.info.model.TaxiZone;
import com.info.model.ZoneSerializer;
import com.info.utils.DBUtils;

public class MySQLProducer {
		
	private static Producer<String, TaxiZone> producer;
	
	private static void createProducer() {
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.CLIENT_ID_CONFIG, "Producer-1");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ZoneSerializer.class);
		
		producer = new KafkaProducer<String, TaxiZone>(properties);
	}
	
	private static void produceMessage(String key, TaxiZone value)throws InterruptedException {
		ProducerRecord<String, TaxiZone> record = new ProducerRecord<String, TaxiZone>("left-input-topic", key, value);
		producer.send(record);
		
		ProducerRecord<String, TaxiZone> record2 = new ProducerRecord<String, TaxiZone>("right-input-topic", key, value);
		producer.send(record2);
		
		System.out.println(value);
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) {

		try {
			// creating producer	
			createProducer();
			
			// getting MySQL connection 
			Connection connection = DBUtils.getMySQLDatabaseConnection();

			// preparing statement
			String query = "select * from taxizone";
			PreparedStatement prepareStatement = connection.prepareStatement(query);

			// executing query
			ResultSet resultSet = prepareStatement.executeQuery();
			
			while(resultSet.next()) {	// 265 times
				TaxiZone taxiZone = new TaxiZone();
				taxiZone.setLocationId(resultSet.getInt("locationid"));
				taxiZone.setBorough(resultSet.getString("borough"));
				taxiZone.setZone(resultSet.getString("zone"));
				taxiZone.setService_zone(resultSet.getString("service_zone"));
				
				// sending string as key and taxizone object as value
				produceMessage(taxiZone.getLocationId()+"", taxiZone);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
