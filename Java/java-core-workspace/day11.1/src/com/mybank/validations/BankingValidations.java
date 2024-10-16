package com.mybank.validations;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;

public class BankingValidations {
	public static BankAccountType parseBankAccountType(String acType) {
		// 1. parse string -> enum
		return BankAccountType.valueOf(acType.toUpperCase());
	}

	/*
	 * Create BankingValidations class Add a static method to validate min bal for
	 * a/c
	 */
	public static void validateBalance
	(BankAccountType acType, double balance) throws BankingException {

		//check for min balance for the specified bank a/c type
		if (balance < acType.getMinBalance())
			throw new BankingException("Insufficient balance!!!!");

	}

	// add a public static method for validating age
	public static LocalDate parseAndValidateDate(String date) throws BankingException {
		LocalDate birthDate = LocalDate.parse(date);
		int ageInYears = Period.between(birthDate, LocalDate.now()).getYears();
		if (ageInYears < 18)
			throw new BankingException("Invalid Age for opening a/c!!!!!");
		return birthDate;
	}
	
	//1.2 Add new validation rule
//	The bank should not be allowed to store duplicate accounts
	public static void accountExists(int acctNo, List<BankAccount> accounts ) throws BankingException{
		BankAccount myAcc = new BankAccount(acctNo);
		if(accounts.contains(myAcc)) {
			throw new BankingException("Account already exists!!!");
		}
		
		
	}
}
