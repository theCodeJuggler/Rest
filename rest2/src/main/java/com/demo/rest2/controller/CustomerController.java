package com.demo.rest2.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.rest2.pojo.Customer;
import com.demo.rest2.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cService;

	@RequestMapping(value="/addCust", method=RequestMethod.POST)
	public String addCustomer(@RequestBody Customer customer) {
		return cService.addCustomer(customer);
	}
	
	@RequestMapping(value="/updtCust/{id}", method=RequestMethod.PUT)
	public String updtCustomer(int id, @RequestBody Customer customer) {
		return cService.updtCustomer(id, customer);
	}
	
	@RequestMapping("/viewCust")
	public Collection getAllCustomers(){
		return cService.getAllCustomers().values();
	}
	
	@RequestMapping(value="/delCust/{id}", method=RequestMethod.DELETE)
	public void delCustomer(@PathVariable int id) {
		cService.delCustomer(id);
	}
}
