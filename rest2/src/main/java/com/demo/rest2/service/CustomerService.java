package com.demo.rest2.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.rest2.dao.CustomerDAO;
import com.demo.rest2.pojo.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO cDao;
	
	@RequestMapping(value="/addCust", method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		return cDao.addCustomer(customer);
	}
	
	@RequestMapping(value="/updtCust/{id}", method=RequestMethod.PUT)
	public String updtCustomer(int id, @RequestBody Customer customer) {
		return cDao.updtCustomer(id, customer);
	}
	
	@RequestMapping("/viewCust/{id}")
	//public Map<Integer, Customer> getAllCustomers(){
	public List<Customer> getAllCustomers(){
		return cDao.getAllCustomers();
	}
	
	public Customer getCustomerById(int id) {
		return cDao.getCustomerById(id);
	}
	
	@RequestMapping(value="/delCust/{id}", method=RequestMethod.DELETE)
	public void delCustomer(@PathVariable int id) {
		cDao.delCustomer(id);
	}
	
}
