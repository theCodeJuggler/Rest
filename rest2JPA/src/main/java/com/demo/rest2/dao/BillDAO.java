package com.demo.rest2.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.rest2.pojo.Bill;

public interface BillDAO extends MongoRepository<Bill, Integer> {
	
	public Bill findBillBybillId(int billId);
	public List<Bill> findBillBycustomerId(int customerId);
}
