package com.example.activeMqConsumer.controller;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqController {
	
	@JmsListener(destination = "Entertainment")
	@SendTo("outbound.topic")
	public String receiveMessageFromTopic(final Message jsonMessage) throws JMSException {
		String messageData = null;
		System.out.println("Received message " + jsonMessage);
		String response = null;
		if(jsonMessage instanceof TextMessage) {
			
			System.out.println("----------ACTIVE MQ LISTENER---------------");
		
			TextMessage textMessage = (TextMessage)jsonMessage;
			messageData = textMessage.getText();
			
			System.out.println(messageData);
			
			XmlParser parser = new XmlParser();
			parser.parsexml(messageData);
			
			/*
			 * Map map = new Gson().fromJson(message, Map.class); response = "Hello " +
			 * map.get("name");
			 */
		}
		return response;
	}

}
