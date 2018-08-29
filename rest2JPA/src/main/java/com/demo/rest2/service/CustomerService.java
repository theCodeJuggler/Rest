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

import com.demo.rest2.dao.BillDAO;
import com.demo.rest2.dao.CustomerDAO;
import com.demo.rest2.pojo.Bill;
import com.demo.rest2.pojo.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO cDao;
	
	@Autowired
	BillDAO bDao;
	
	public String addCustomer(@RequestBody Customer customer) {
		cDao.save(customer);
		return "Successfully Added";
	}
	
	public String updtCustomer(int id, @RequestBody Customer customer) {
		cDao.save(customer);
		return "Successfully Updated";
	}
	
	public List<Customer> getAllCustomers(){
		return cDao.findAll();
	}
	
	public Customer getCustomerById(int id) {
		
		return cDao.getOne(id);
	}
	
	public void delCustomer(@PathVariable int id) {
		cDao.deleteById(id);
	}
	
	public String addBill(Bill bill) {
		bDao.save(bill);
		return "Successfully Added Bill";
	}
	
	public String updtBill(int id, Bill bill) {
		bDao.save(bill);
		return "Updated Successfully";
	}
	
	public Bill getBillById(int id){
		return bDao.findBillBybillId(id);
	}
	
	public List<Bill> viewBills(int customerId){
		return bDao.findBillBycustomerId(customerId);
	}
	
}
