package com.example.activeMqConsumer.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Xmltojson {
	
	public static void main(String args[])
	{
		File file  = new File("C:\\Users\\dell\\Desktop\\emp.xml");
		
		
		
	   
		
		try {
			JAXBContext context = JAXBContext.newInstance(Cd.class);
			//Unmarshaller unmarshaller = 
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
