package com.demo.rest2.pojo;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Bill")
public class Bill {

	@Id
	private ObjectId _id;
	private int billId;
	private int customerId;
	private int quantity;
	private int total;
	
	public Bill(int billId, int customerId, int quantity, int total) {
	
		this.billId = billId;
		this.customerId = customerId;
		this.quantity = quantity;
		this.total = total;
	}
	
	public Bill() {
		
	}
	
	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", customerId=" + customerId + ", quantity=" + quantity + ", total=" + total
				+ "]";
	}
	
}
