package com.mybank.core;

public enum BankAccountType {
	SAVING(10000), CURRENT(5000), FD(50000), LOAN(25000);
	private double minBalance;
	private BankAccountType(double minBalance)
	{
	//	super(name,ordinal);
		this.minBalance=minBalance;
	}
	//getter 
	public double getMinBalance() {
		return minBalance;
	}	
//	@Override
//	public String toString() {
//		return name().toLowerCase()+ "min bal "+minBalance;
//	}	
}
