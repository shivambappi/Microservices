package com.dreamers.emailsend.controller;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamers.emailsend.service.Emailservice;

@RestController
public class EmailController {
	
	@Autowired
	private Emailservice emailservice;
	
	 
	private static final Logger log = LoggerFactory.getLogger(EmailController.class);

	
	@RequestMapping(value = "/sendemail")
	public String sendEmail() {
		try {
			log.info("going to send mail");
			emailservice.sendmail();
			log.info(" send mail");
			
			
		}
		catch(Exception e)
		{
			log.info("catching exception");
			e.printStackTrace();
			return "fail sending email" + e.getMessage();
		}
	   return "Email sent successfully";   
	}

}
