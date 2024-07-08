package com.oops.encapsulation;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter the customer details");
		System.out.println("Enter the id:");
		int n=input.nextInt();
		c.setId(n);
		System.out.println("Enter the name:");
		String name=input.nextLine();
		c.setName(name);
		System.out.println("Enter the email:");
		String email=input.nextLine();
		c.setEmail(email);
		System.out.println("Enter the address:");
		String address=input.nextLine();
		c.setAddress(address);
		System.out.println("Enter the purpose:");
		String purpose=input.nextLine();
		c.setPurpose(purpose);
		System.out.println("Enter the other customer details:");
		String other=input.nextLine();
		c.setOtherDetails(other);
		System.out.println("Customer details are :");
		System.out.println("ID:"+c.getId());
		System.out.println("Name:"+c.getName());
		System.out.println("Email:"+c.getEmail());
		System.out.println("Address:"+c.getAddress());
		System.out.println("Purpose:"+c.getPurpose());
		System.out.println("Other details:"+c.getOtherDetails());
		
	}
}
