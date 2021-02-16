package com.dreamers.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCompany {
	
	private Company company;
	private Employee employee;
	
	

}
