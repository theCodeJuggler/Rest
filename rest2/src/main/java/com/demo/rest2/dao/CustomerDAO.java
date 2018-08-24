package com.demo.rest2.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/*
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
*/

import com.demo.rest2.pojo.Customer;

@Repository
public class CustomerDAO {
	
	//Map<Integer, Customer> listOfCustomer = new HashMap<Integer, Customer>();
	List<Customer> listOfCustomer = new ArrayList<>();
	public String addCustomer(Customer customer)
	{
		//listOfCustomer.put(customer.getId(),customer);
		listOfCustomer.add(customer);
		
		return "Successfully";
	}
	
	public String updtCustomer(int id, Customer customer){
		listOfCustomer.set(id,customer);
		
		return "Successfully Updated";
	}
	
	public Customer getCustomerById(int id) {
		
		return listOfCustomer.stream().filter(c -> c.getId()==id).findFirst().get();
	}
	
	public List<Customer> getAllCustomers(){
		return listOfCustomer;
	}
	
	public void delCustomer(int id) {
		listOfCustomer.remove(id);
	}
}
