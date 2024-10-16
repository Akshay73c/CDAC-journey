package com.mybank.operations;

import com.mybank.custom_exceptions.BankingException;

public interface BankOperations {
	// add a method to open new bank a/c
	String openBankAccount(int acctNo, String acType, double balance, String firstName, String lastName, String dob)
			throws BankingException;

	// add a method to display info of all a/cs
	void displayAllAccounts();

	void displayAccountSummary(int acctNo) throws BankingException;

	String withdraw(int acctNo, double nextDouble) throws BankingException;

	String deposit(int acctNo, double nextDouble) throws BankingException;

	void sortAccountsByAccountNumber();

	String transferFunds(int srcAcNo, int destAcNo, double amount) throws BankingException;

	void sortAccountsByBalance();
	void sortAccountByCustomerDob();

}
