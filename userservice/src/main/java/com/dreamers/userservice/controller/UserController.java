package com.dreamers.userservice.controller;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dreamers.userservice.entity.Employee;
import com.dreamers.userservice.entity.EmployeeCompany;
import com.dreamers.userservice.service.UserService;
import com.google.common.net.MediaType;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{id}")
    public EmployeeCompany getUser(@PathVariable("id") String id)
    {
		EmployeeCompany employeeCompany=userService.getUserDetails(Integer.valueOf(id));
		
		return employeeCompany;
    	
    }
	
	@PostMapping("/")
	public void saveUser(@RequestBody Employee employee)
	{
		userService.saveUser(employee);
				
	}

	
	
	
}
