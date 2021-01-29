package com.dreamers.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dreamers.userservice.entity.*;


@Repository
public interface UserDao extends JpaRepository<Employee, Integer> {

}
