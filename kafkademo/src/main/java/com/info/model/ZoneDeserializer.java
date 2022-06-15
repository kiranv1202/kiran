package com.info.model;

import java.io.Closeable;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.google.gson.Gson;

public class ZoneDeserializer implements Closeable, AutoCloseable, Deserializer<TaxiZone> {

	static private Gson gson = new Gson();

	public ZoneDeserializer() {
	}
	
	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}
	
	@Override
	public TaxiZone deserialize(String topic, byte[] bytes) {
		String zone = new String(bytes);
		return gson.fromJson(zone, TaxiZone.class);
	}

}
