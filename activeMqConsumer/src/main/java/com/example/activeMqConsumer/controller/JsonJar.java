package com.example.activeMqConsumer.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;

public class JsonJar {
	
	
	public static void main(String args[]) throws FileNotFoundException
	{
		
		
		 
		
	//	FileReader fileReader = new FileReader("E://Projects//activeMqConsumer//src//main//resources//shivam.json");
		
	String sf;
	try {
		sf = new String(Files.readAllBytes(Paths.get("E://Projects//activeMqConsumer//src//main//resources//shivam.json")));
		JSONObject json  = new JSONObject(sf);
		String s3=XML.toString(json);
		System.out.println(s3);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	
		
		
		
	}

}
