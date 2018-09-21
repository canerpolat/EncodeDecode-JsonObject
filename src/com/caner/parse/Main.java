package com.caner.parse;

public class Main extends Object {

	public void islem() {

		String json = json();
		String encode = encode(json);
		String decode = decode(encode);
		String jsonValues = getJson(decode); 
		setEntity(jsonValues);
		System.out.println(jsonValues);
	}

	public static void main(String[] args) {

		Main Ornek = new Main();
		Ornek.islem();
		
	}

}
