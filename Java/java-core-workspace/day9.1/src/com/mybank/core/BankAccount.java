package com.mybank.core;

import java.time.LocalDate;

/*
 * 1. Bank Account - account no(int), 
 * account type (SAVING|CURRENT|FD|LOAN) , 
 * balance (double) , 
 * customer first n last name , 
 * customer's dob(LocalDate)
Add suitable constructor n toString
PK (UID) - account no
 */
public class BankAccount {
	private int acctNo;
	// HAS-A relationship (BankAccount HAS-A BankAccountType)
	private BankAccountType acType;
	private double balance;
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public BankAccount(int acctNo, BankAccountType acType, double balance, String firstName, String lastName,
			LocalDate dob) {
		super();
		this.acctNo = acctNo;
		this.acType = acType;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", acType=" + acType + ", balance=" + balance + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob + "]";
	}

	/*
	 * Override equals method , to replace reference. equality by content equality
	 * (UID - acct no)
	 */
	@Override
	public boolean equals(Object anotherObject) {
		System.out.println("in acct's equals");
		if (anotherObject instanceof BankAccount)
			return this.acctNo == ((BankAccount) anotherObject).acctNo;
		return false;
	}
	
	//getters
	public int getAccNo() {
		return acctNo;
	}

}
