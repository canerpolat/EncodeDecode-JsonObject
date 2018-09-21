package com.caner.parse;

import java.util.Base64;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Object {

	public String json() {
		JsonObject object = new JsonObject();
		object.addProperty("Marka", "Honda");
		object.addProperty("Model", "Civic");
		object.addProperty("Yil", 2005);
		return object.toString();
	}

	public String encode(String jsonData) {

		byte[] encodedBytes = Base64.getEncoder().encode(jsonData.getBytes());
		return new String(encodedBytes);
	}

	public String decode(String jsonData) {
		byte[] decodedBytes = Base64.getDecoder().decode(jsonData);
		return new String(decodedBytes);
	}

	public String getJson(String decodedBytes) {

		JsonParser parser = new JsonParser();
		JsonObject object = (JsonObject) parser.parse(decodedBytes);
		return object.toString();
	}

	public void setEntity(String jsonObject) {

		UserEntity userEntity = new UserEntity();

		JsonParser parser = new JsonParser();
		JsonObject object = (JsonObject) parser.parse(jsonObject);

		userEntity.setMarka(object.get("Marka").toString());
		userEntity.setModel(object.get("Model").toString());
		userEntity.setYil(object.get("Yil").toString());
		
		System.out.println(userEntity.getModel() + " " + userEntity.getMarka() + " " + userEntity.getYil());

	}

}
