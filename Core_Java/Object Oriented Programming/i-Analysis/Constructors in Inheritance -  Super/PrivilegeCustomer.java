package com.oops.constructor;

public class PrivilegeCustomer extends Customer{
	public PrivilegeCustomer(String name,String address,Integer age,String mobileNumber) {
		super(name,address,age,mobileNumber);
	}
	
	Double getBillAmount(Double amount) {
		return (amount-(amount*30/100));
	}

}
