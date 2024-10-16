package com.mybank.validations;

import java.time.LocalDate;
import java.time.Period;

import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;

public class BankingValidations {
	/*
	 * Create BankingValidations class
      Add a static method to validate min bal for a/c
	 */
	public static BankAccountType validateBalance(
			String acType,double balance) throws BankingException{
		//1. parse string -> enum
		BankAccountType type=BankAccountType.
				valueOf(acType.toUpperCase());
		//2. => parsing success , now check for min balance
		if(balance < type.getMinBalance())
			throw new BankingException("Insufficient balance!!!!");
		return type;
	}
	
	//method for age validation
	public static void validateAge(LocalDate dob) throws BankingException {
		int age = Period.between( dob, LocalDate.now()).getYears();
		System.out.println(age);
		if (age < 18) {
			throw new BankingException("Age not valid!!!!");
		}
//		or can return birthDate here. but why?? whats the need
	}
}
