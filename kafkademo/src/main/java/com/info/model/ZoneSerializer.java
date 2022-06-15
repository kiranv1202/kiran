package com.info.model;

import java.io.Closeable;
import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.google.gson.Gson;

public class ZoneSerializer implements Closeable, AutoCloseable, Serializer<TaxiZone> {
	static private Gson gson = new Gson();
	
	public ZoneSerializer() {
	}
	
	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}

	
	@Override
	public byte[] serialize(String topic, TaxiZone taxiZone) {
		String line = gson.toJson(taxiZone);

		return line.getBytes();
	}

	

}
