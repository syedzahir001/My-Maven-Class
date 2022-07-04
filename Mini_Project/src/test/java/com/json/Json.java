package com.json;

import java.io.File;

import org.json.simple.parser.JSONParser;

import io.restassured.internal.support.FileReader;

public class Json {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Mohamed Musthak Y\\eclipse-workspace\\Mini_Project\\src\\main\\java\\com\\payloa\\Payload.json");
		
		
		FileReader reader = new FileReader();
		
		JSONParser parser = new JSONParser();
		
		Object parse =	parser.parse(reader);
		
		
		
		
		
	}

}
