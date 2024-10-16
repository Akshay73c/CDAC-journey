package com.myBank.core;

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
public class BankAccount implements Comparable<BankAccount>{
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
	//add overloaded ctor to init BankAccount with PK(acct no)
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
	//getter

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
	

}
