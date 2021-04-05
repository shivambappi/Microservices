package com.dreamers.companyservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreamers.companyservice.entity.Company;


@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{

}
