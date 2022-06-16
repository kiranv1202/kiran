package com.info.consumer;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
import com.info.utils.DBUtils;

public class MySQLConsumer {

	private static KafkaConsumer<String, TaxiZone> consumer;
	private static Connection connection;

	static {		
		connection = DBUtils.getMySQLDatabaseConnection();
		System.out.println("Getting MySQL connection");
	}

	private static void createConsumer() {
		Properties properties = new Properties();
		properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ConsumerConfig.GROUP_ID_CONFIG, "kafka-consumer");
		properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
		properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
		properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ZoneDeserializer.class);

		consumer = new KafkaConsumer<String, TaxiZone>(properties);
	}

	private static void getMessages() {

		consumer.subscribe(Collections.singletonList("zone-topic"));

		while (true) {
			ConsumerRecords<String, TaxiZone> listOfRecords = consumer.poll(Duration.ofMillis(100));

			for (ConsumerRecord<String, TaxiZone> record : listOfRecords) {
				insertData(record.value());
			}
		}
	}

	private static void insertData(TaxiZone taxiZone) {
		try {
			String query = "insert into zone values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, taxiZone.getLocationId());
			preparedStatement.setString(2, taxiZone.getBorough());
			preparedStatement.setString(3, taxiZone.getZone());
			preparedStatement.setString(4, taxiZone.getService_zone());
			
			preparedStatement.executeUpdate();
			System.out.println(taxiZone.getLocationId() + " :record inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		createConsumer();

		getMessages();
	}
}
