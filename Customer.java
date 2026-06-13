package com.car_rental_sys;

public class Customer {
	private String customerName;
	private String customerid;
	
	
	public Customer(String customerName, String customerid) {
		this.customerName = customerName;
		this.customerid = customerid;
	}


	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerid() {
		return customerid;
	}

	
	
}
