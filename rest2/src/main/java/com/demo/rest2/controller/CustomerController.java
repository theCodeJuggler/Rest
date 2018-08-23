package com.demo.rest2.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

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
	
	/*@RequestMapping(value="/updtCust/{id}", method=RequestMethod.PUT)
	public String updtCustomer(int id, @RequestBody Customer customer) {
		return cService.updtCustomer(id, customer);
	}*/
	
	@RequestMapping("/viewCust")
	public Collection getAllCustomers(){
		return cService.getAllCustomers();//.values();
	}
	
	@RequestMapping("/viewCust/{start}/{count}")
	public Resources getAllCustomersByPage(@PathVariable() int start, @PathVariable() int count){
		
		List<Customer> tempCustomer = (List<Customer>) getAllCustomers();
		List<Customer> customer = new ArrayList<>();
		
		for(int i=start; i<(start+count); i++)
			customer.add(tempCustomer.get(i-1));
		
		Link nxtLink = linkTo(methodOn(this.getClass()).getAllCustomersByPage(start+count, count)).withRel("Next Link");
		Link prevLink = linkTo(methodOn(this.getClass()).getAllCustomersByPage(start-count>=0?start-count:1, count)).withRel("Previous Link");
		
		Resources resources = new Resources(customer, nxtLink, prevLink);
		
		return resources;
		//return cService.getAllCustomers().values();
	}
	
	@RequestMapping("/viewCust/{id}")
	public Customer getCustomerById(@PathVariable() int id) {
		
		return cService.getCustomerById(id-1);
	}
	
	@RequestMapping(value="/delCust/{id}", method=RequestMethod.DELETE)
	public void delCustomer(@PathVariable int id)
	{
		cService.delCustomer(id-1);
	}
}
