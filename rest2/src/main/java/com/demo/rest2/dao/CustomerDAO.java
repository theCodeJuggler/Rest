package com.demo.rest2.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.rest2.pojo.Customer;

@Repository
public class CustomerDAO {
	
	Map<Integer, Customer> listOfCustomer = new HashMap<Integer, Customer>();
	
	public String addCustomer(Customer customer)
	{
		listOfCustomer.put(customer.getId(),customer);
		
		return "Successfully";
		/*Customer cust = new Customer(id,customerName,contactNumber,dateOfBirth,address,nationality,gender);
		listOfCustomer.put(id,cust);*/
	}
	
	public void updtCustomer(int id, Customer customer){
		listOfCustomer.replace(id,customer);
	}
	
	public Map<Integer, Customer> getAllCustomers(){
		return listOfCustomer;
	}
	
	public void delCustomer(int id) {
		listOfCustomer.remove(id);
	}
}
