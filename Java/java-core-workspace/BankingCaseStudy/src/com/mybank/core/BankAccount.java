package com.mybank.core;

import java.time.LocalDate;

/*
 * 1. Bank Account - a core class 
 * account no(int), 
 * account type (SAVING|CURRENT|FD|LOAN) , 
 * balance (double) , 
 * customer first n last name , 
 * customer's dob(LocalDate)
Add suitable constructor n toString
PK (UID) - account no
 */
public class BankAccount implements Comparable<BankAccount>{
	private int acctNo;
	private BankAccountType acType; // HAS-A relationship (BankAccount HAS-A BankAccountType)
	private double balance;
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public BankAccount(int acctNo, BankAccountType acType, double balance, String firstName, String lastName,
			LocalDate dob) {
		//super();
		this.acctNo = acctNo;
		this.acType = acType;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	//overloaded ctor to init BankAccount with PK(acct no) - useful for calling compareTo, equals method
	public BankAccount(int acctNo) {
		this.acctNo=acctNo;
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
	
	//implement - compareTo - to supply comparison function.
	@Override
	public int compareTo(BankAccount anotherAccount)
	{
		System.out.println("in compareTo");
		if(this.acctNo < anotherAccount.acctNo)
			return -1;
		if(this.acctNo == anotherAccount.acctNo)
			return 0;
		return  1;
	}
	
	//getters and setters

		public int getAcctNo() {
			return acctNo;
		}
		public BankAccountType getAcType() {
			return acType;
		}
		public double getBalance() {
			return balance;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
	

}
