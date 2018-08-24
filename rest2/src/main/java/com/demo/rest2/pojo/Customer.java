package com.demo.rest2.pojo;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

public class Customer {

	private int id;
	private String customerName;
	private String contactNumber;
	private String dateOfBirth;
	private String address;
	private String nationality;
	private String gender;
	private String url;
	
	public Customer() {
		
	}
	public Customer(int id, String customerName, String contactNumber, String dateOfBirth, String address,
			String nationality, String gender) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.nationality = nationality;
		this.gender = gender;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", contactNumber=" + contactNumber
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", nationality=" + nationality + ", gender="
				+ gender + "]";
	}
	
}
