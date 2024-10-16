package com.mybank.custom_exceptions;

public class BankingException extends Exception {
	public BankingException(String mesg) {
		super(mesg); //calls Exception's constr -> which calls Throwable's constr which sets the mesg 
	}

}
