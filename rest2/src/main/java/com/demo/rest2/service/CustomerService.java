package com.demo.rest2.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest2.dao.CustomerDAO;
import com.demo.rest2.pojo.Customer;

@RestController
public class CustomerService {
	
	@Autowired
	CustomerDAO cDao;

	@RequestMapping(value="/addCust", method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		return cDao.addCustomer(customer);
	}
	
	@RequestMapping(value="/updtCust/{}", method=RequestMethod.PUT)
	public void updtCustomer() {
		
	}
	
	@RequestMapping("/viewCust")
	public Map<Integer, Customer> getAllCustomers(){
		return cDao.getAllCustomers();
	}
	
	@RequestMapping(value="/delCust/{id}", method=RequestMethod.DELETE)
	public void delCustomer(@PathVariable int id) {
		cDao.delCustomer(id);
	}
}
