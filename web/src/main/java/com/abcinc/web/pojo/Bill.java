package com.abcinc.web.pojo;

public class Bill {

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
