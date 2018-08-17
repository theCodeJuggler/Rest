package com.demo.rest2.dao;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.demo.rest2.pojo.Customer;

public class CustomerDAO {
	
	Map<Integer, Customer> listOfCustomer = new HashMap<Integer, Customer>();
	
	public void addCustomer(int id, String customerName, String contactNumber, String dateOfBirth, String address, String nationality, String gender)
	{
		Customer cust = new Customer(id,customerName,contactNumber,dateOfBirth,address,nationality,gender);
		listOfCustomer.put(id,cust);
	}
	
	public void updtCustomer(int id){
		
	}
	
	public Map<Integer, Customer> getAllCustomers(){
		return listOfCustomer;
	}
	
	public void delCustomer(int id) {
		
		for(int idc : )
		listOfCustomer.remove(arg0);
		
	}
}
