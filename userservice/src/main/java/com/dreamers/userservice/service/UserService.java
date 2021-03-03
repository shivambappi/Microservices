package com.dreamers.userservice.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dreamers.userservice.entity.*;
import com.dreamers.userservice.dao.*;
import java.util.*;


@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private RestTemplate resttemplate;

	public EmployeeCompany getUserDetails(Integer id) {
		

		
	Employee employee =	userDao.findAll().parallelStream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0);
	
	System.out.println("---------------------------------------------------------");
	
	Company Comp=resttemplate.getForObject("http://localhost:9090/company/" +employee.getCompanyId().toString(),Company.class);
	
	System.out.println(Comp);	
	
	  EmployeeCompany employeeCompany = new EmployeeCompany();
	  employeeCompany.setCompany(Comp);
	  
	
	  employeeCompany.setEmployee(employee);
	  
	  return employeeCompany;
	
	}

	public void saveUser(Employee emp) {
		
		userDao.save(emp);
		
		
	}

}
