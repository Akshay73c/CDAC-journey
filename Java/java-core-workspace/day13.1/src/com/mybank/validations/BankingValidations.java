package com.mybank.validations;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;

public class BankingValidations {
	// add a static method to check for dup acct number
	public static void checkForDuplicate(int acNo, Map<Integer, BankAccount> acctMap) throws BankingException {
		if (acctMap.containsKey(acNo))// auto boxing
			throw new BankingException("A/c with the same acct no already exists !!!!!");
	}

	public static BankAccountType parseBankAccountType(String acType) {
		// 1. parse string -> enum
		return BankAccountType.valueOf(acType.toUpperCase());
	}

	/*
	 * Create BankingValidations class Add a static method to validate min bal for
	 * a/c
	 */
	public static void validateBalance(BankAccountType acType,
			double balance) throws BankingException {

		// check for min balance for the specified bank a/c type
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
}
