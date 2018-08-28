package com.demo.rest2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.rest2.pojo.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

}
