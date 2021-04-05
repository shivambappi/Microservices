package com.dreamers.companyservice.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.dreamers.companyservice.dao.CompanyDao;
import com.dreamers.companyservice.entity.Company;


@Service
public class CompanyService {
	
	@Autowired
	private CompanyDao companyDao;

	public void saveCompanyDetails(Company company) {
		
		
		companyDao.save(company);
		
	}

	public List<Company> getCompanyDetails(Integer id) {
		
		return companyDao.findAll().parallelStream().filter(x->x.getCompanyId()==id).collect(Collectors.toList());
	}

}
