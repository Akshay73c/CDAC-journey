package com.mybank.core;

//enum for BankAccType
public enum BankAccountType {
	SAVING(10000), CURRENT(5000), FD(50000), LOAN(25000);
	
	private double minBalance; //extra field
	
	private BankAccountType(double minBalance){	//constr to init extra field. Is private. Can't call explicitely. 
//		super(name,ordinal); //	Enum constrs are always private (or default?)
//		why?? - for security purpose. what purposes? -> wohi normal wale.
		this.minBalance=minBalance;
	}
	//getter 
	public double getMinBalance() {
		return minBalance;
	}	
	@Override
	public String toString() {
		return name().toLowerCase()+ "min bal "+minBalance;
	}	
}
