package com.mybank.operations;

import java.time.LocalDate;

import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;

public interface BankOperations {
	//add a method to open new bank a/c
	String openBankAccount(int acctNo, String acType, 
			double balance, String firstName, String lastName,
			String dob) throws BankingException;
	//add a method to display info of all a/cs
	void displayAllAccounts();
	
	//
	void fetchAccSummary(int accNo) throws BankingException;
	

}
