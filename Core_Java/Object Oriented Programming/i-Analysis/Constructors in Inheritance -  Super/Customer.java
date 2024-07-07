package com.oops.constructor;

public class Customer {
	String name;
	String address;
	Integer age;
	String mobileNumber;
	Customer(String name,String address,Integer age,String mobileNumber){
		this.name=name;
		this.address=address;
		this.age=age;
		this.mobileNumber=mobileNumber;
	}
	public void displayCustomer() {
		System.out.println("Bill Details");
		System.out.println("Name "+this.name);
		System.out.println("Mobile "+this.mobileNumber);
		System.out.println("Age "+this.age);
		System.out.println("Address "+this.address);
		
	}
}
