package com.mybank.operations;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;

import static com.mybank.validations.BankingValidations.*;

import java.time.LocalDate;

public class BankOperationsImpl implements BankOperations {
	// state (non static data members)
	private BankAccount[] accounts;// mem allocated in -heap
	private int counter;

	public BankOperationsImpl(int size) {
		accounts = new BankAccount[size];
	}

	@Override
	public String openBankAccount(int acctNo, 
			String acType, double balance, String firstName, 
			String lastName,
			String dob) throws BankingException {
		// validate i/ps - balance , actype
		BankAccountType accountType = validateBalance(acType, balance);
		// parse the local date
		LocalDate birthDate = LocalDate.parse(dob);
		//validate age
		validateAge(birthDate);

		// => i/ps are valid
		accounts[counter++] = new BankAccount(acctNo, accountType, balance, firstName, lastName, birthDate);
		return "A/C created successfully for the customer " + firstName + " " + lastName;
	}

	@Override
	public void displayAllAccounts() {
		System.out.println("All a/cs");
		for (BankAccount a : accounts) {
			if (a == null)
				break;
			System.out.println(a);
		}
	}
	
//	
	@Override
	public void fetchAccSummary(int AccNo) throws BankingException {
		boolean foundAcc = false;
		for (BankAccount a : accounts) {
			
				if (a.getAccNo() == AccNo) {
					foundAcc = true;
					System.out.println(a);
				}
//			}
		}
		
		if (!foundAcc) 
			throw new BankingException("Account Not found!!!");
	}

}
