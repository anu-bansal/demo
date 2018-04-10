package com.example.demo;

import java.util.List;


public class Customer {

	
	private String customerId;
	private String mobileNo;
	private String password;
	private String firstName;
	private String lastName;
	private List<Address> addresses;
	private Address primaryAddress;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Customer(String customerId, String mobileNo, String password, String firstName, String lastName,
			List<Address> addresses, Address primaryAddress) {
		super();
		this.customerId = customerId;
		this.mobileNo = mobileNo;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresses = addresses;
		this.primaryAddress = primaryAddress;
	}




	public String getCustomerId() {
		return customerId;
	}




	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}




	public String getMobileNo() {
		return mobileNo;
	}




	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public List<Address> getAddresses() {
		return addresses;
	}




	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}




	public Address getPrimaryAddress() {
		return primaryAddress;
	}




	public void setPrimaryAddress(Address primaryAddress) {
		this.primaryAddress = primaryAddress;
	}
	
	
	
	
	
}
