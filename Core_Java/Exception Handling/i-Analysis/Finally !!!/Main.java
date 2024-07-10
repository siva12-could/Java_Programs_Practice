package com.oops.encapsulation;
import java.util.*;
import java.text.DecimalFormat;

import java.lang.*;
import java.io.*;
class Main{
public static void main(String[] args) throws Exception{
	String accountNumber;
	Double avamount;
	Double tamount;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the transaction details\nEnter the account number");
	DecimalFormat df=new DecimalFormat("#.0");
	accountNumber=input.nextLine();
	System.out.println("Enter the available amount");
	avamount=Double.parseDouble(input.nextLine());
	Transaction t=new Transaction(accountNumber,avamount);
	try {
		do {
			System.out.println("Enter the transaction amount");
			tamount=Double.parseDouble(input.nextLine());
			t.validate(tamount);
			t.setAvamount(t.getAvamount()-tamount);
			System.out.println("Do you want to enter more ?(yes/no)");  
		}while(input.nextLine().equals("yes"));
	}catch(Exception e) {
		System.out.println("Insufficient Balance");
		
	}
	finally {
		System.out.println("Your available balance "+df.format(t.getAvamount()));
	}
	
	
}

}
