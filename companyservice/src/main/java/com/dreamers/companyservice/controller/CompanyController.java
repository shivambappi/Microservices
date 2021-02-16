package com.dreamers.companyservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import javax.ws.rs.core.Application;

import com.dreamers.companyservice.entity.Company;
import com.dreamers.companyservice.service.CompanyService;


@RestController
public class CompanyController {
	
	//private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	private CompanyService companyservice;
	
	@PostMapping("/company")
	public void saveCompanyDetails(@RequestBody Company company)
	{
		companyservice.saveCompanyDetails(company);
		
	}
	
	
	@GetMapping("/compemp/{id}")
	public String getmenow(@PathVariable("id") String id)
	{
		return "Company Service is up and running";
	}
	
	@GetMapping(value="/company/{id}")
	public Company getCompanyDetails(@PathVariable("id") String id)
	{
		Company comp=companyservice.getCompanyDetails(Integer.valueOf(id)).get(0);
		return comp;
	}
	
	
	
	
	

}
