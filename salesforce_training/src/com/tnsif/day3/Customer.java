package com.tnsif.day3;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	public Customer(int customerId, String customerName, String customerAddress) {
		//parametrized Constructor
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		System.out.println("Parametrized Constructor");	
		}
	//Default Constructor
	public Customer()
	{
		super();
		System.out.println("Default Constructor");
	}
	//getter setter 
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	
}
