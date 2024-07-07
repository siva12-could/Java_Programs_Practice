package com.oops.constructor;
import java.util.*;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
public class Main{
	
	public static void main(String[] args) throws IOException {
		String name;
		String address;
		Integer age;
		String mobileNumber;
		Double amount,amt;
		
		int n;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1)Pivilege Customer\n2)SeniorCitizen Customer\nEnter Customer Type");
		n=Integer.parseInt(input.readLine());
		DecimalFormat df=new DecimalFormat("#.00");
		
		if(n==1) {
			System.out.println("Enter The Name");
			name=input.readLine();
			System.out.println("Enter The Age");
			age=Integer.parseInt(input.readLine());
			System.out.println("Enter The Address");
			address=input.readLine();
			System.out.println("Enter The Mobile Number");
			mobileNumber=input.readLine();
			System.out.println("Enter The Purchased Amount");
			amount=Double.parseDouble(input.readLine());
			PrivilegeCustomer pc=new PrivilegeCustomer(name,address,age,mobileNumber);
			pc.displayCustomer();
			amt=pc.getBillAmount(amount);
			System.out.println("Your bill amount is Rs "+amount+". "+"Your bill amount amount is discount under privilege customer");
			System.out.println("You have to pay Rs "+df.format(amt));
			
			
		}
		else if(n==2) {
			System.out.println("Enter The Name");
			name=input.readLine();
			System.out.println("Enter The Age");
			age=Integer.parseInt(input.readLine());
			System.out.println("Enter The Address");
			address=input.readLine();
			System.out.println("Enter The Mobile Number");
			mobileNumber=input.readLine();
			System.out.println("Enter The Purchased Amount");
			amount=Double.parseDouble(input.readLine());
			SeniorCitizenCustomer sc=new SeniorCitizenCustomer(name,age,address,mobileNumber);
			sc.displayCustomer();
			amt=sc.getBillAmount(amount);
			System.out.println("Your bill amount is Rs "+amount+". "+"Your bill amount is discount under privilege customer");
			System.out.println("You have to pay Rs "+df.format(amt));
			
		}
		else {
			System.out.println("Invalid Customer Type");
		}
	}		
}

