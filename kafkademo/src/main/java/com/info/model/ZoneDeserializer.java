package com.info.model;

import java.io.Closeable;

import org.apache.kafka.common.serialization.Deserializer;

import com.google.gson.Gson;

public class ZoneDeserializer implements Closeable, AutoCloseable, Deserializer<TaxiZone> {
	
	private static Gson gson = new Gson();

	@Override
	public TaxiZone deserialize(String topic, byte[] data) {
			
		String zone = new String(data);
		return gson.fromJson(zone, TaxiZone.class);

	}

	@Override
	public void close()  {
		
	}
	
}
