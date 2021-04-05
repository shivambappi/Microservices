package com.example.activemqproducer.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.activemqproducer.entitity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/produce")
public class Producer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping("/message")
	public Student sendMessage(@RequestBody Student student) {

		try {

			FileReader filesReader = new FileReader("C://Users//dell//Desktop//emp.xml");

			BufferedReader bufferedReader = new BufferedReader(filesReader);
			String s = new String(Files.readAllBytes((Paths.get(("C://Users//dell//Desktop//emp.xml")))));
            
			
			System.out.println("File is "+ s);
			ObjectMapper mapper = new ObjectMapper();
			String studentAsJson = mapper.writeValueAsString(student);
			System.out.println("Hi");
			// jmsTemplate.convertAndSend("abctopic", studentAsJson);
			jmsTemplate.convertAndSend("Entertainment", s);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
}
