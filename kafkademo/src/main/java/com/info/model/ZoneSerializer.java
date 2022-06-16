package com.info.model;

import java.io.Closeable;

import org.apache.kafka.common.serialization.Serializer;

import com.google.gson.Gson;

public class ZoneSerializer implements Closeable, AutoCloseable, Serializer<TaxiZone> {

	static private Gson gson = new Gson();

	@Override
	public byte[] serialize(String topic, TaxiZone taxiZone) {		// converting java object to json

		String jsonObject = gson.toJson(taxiZone);
		return jsonObject.getBytes();
	}

	@Override
	public void close() {

	}

}
