package com.oops.constructor;

public class SeniorCitizenCustomer extends Customer{
	String name;
	Integer age;
	String address;
	String mobileNumber;
	
	public SeniorCitizenCustomer(String name,Integer age,String address,String mobileNumber) {
		super(name,address,age,mobileNumber);
		
	}
	Double getBillAmount(Double amount) {
		return (amount-(amount*12/100));
	}
	
}
