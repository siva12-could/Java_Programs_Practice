
package com.oops.encapsulation;

import java.lang.*;
import java.util.*;
public class Transaction {
	String accountNumber;
	Double avamount;
	public Transaction(String accountNumber, Double avamount) {
		super();
		this.accountNumber = accountNumber;
		this.avamount = avamount;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAvamount() {
		return avamount;
	}
	public void setAvamount(Double avamount) {
		this.avamount = avamount;
	}
	public boolean validate(Double tamount) throws Exception {
		if(tamount>avamount || avamount<500) {
			throw new Exception("Insufficient Balance");
		}
		else {
			return true;
		}
	}
}
