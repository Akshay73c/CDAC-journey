package com.mybank.operations;

import static com.mybank.validations.BankingValidations.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;
import com.mybank.custom_ordering.BankAccountBalanceComparator;

public class BankOperationsImpl implements BankOperations {
	// state (non static data members)
	private List<BankAccount> accounts;// mem allocated in -heap - reference

	public BankOperationsImpl() {
		accounts = new ArrayList<>();// size=0, init capa=10
		// populate list
		BankAccount a1 = new BankAccount(101, BankAccountType.SAVING, 15000, "a1", "b1", LocalDate.parse("1990-12-17"));
		BankAccount a2 = new BankAccount(10, BankAccountType.SAVING, 17000, "a2", "b2", LocalDate.parse("1993-12-17"));
		BankAccount a3 = new BankAccount(55, BankAccountType.CURRENT, 6000, "a3", "b3", LocalDate.parse("1991-10-17"));
		BankAccount a4 = new BankAccount(20, BankAccountType.FD, 150000, "a4", "b4", LocalDate.parse("1989-12-07"));
		BankAccount a5 = new BankAccount(81, BankAccountType.LOAN, 200000, "a5", "b5", LocalDate.parse("1991-02-15"));
		BankAccount a6 = new BankAccount(62, BankAccountType.SAVING, 12000, "a6", "b6", LocalDate.parse("1990-12-18"));
		accounts.add(a1);
		accounts.add(a2);
		accounts.add(a3);
		accounts.add(a4);
		accounts.add(a5);
		accounts.add(a6);
	}

	@Override
	public String openBankAccount(int acctNo, String acType, double balance, String firstName, String lastName,
			String dob) throws BankingException {
		// add new validation rule - no dup accounts !
		checkForDuplicate(acctNo, accounts);

		// validate i/ps - balance , actype
		BankAccountType accountType = parseBankAccountType(acType);
		validateBalance(accountType, balance);
		// parse the local date n validate age
		LocalDate birthDate = parseAndValidateDate(dob);
		// => i/ps are valid
		accounts.add(new BankAccount(acctNo, accountType, balance, firstName, lastName, birthDate));
		return "A/C created successfully for the customer " + firstName + " " + lastName;
	}

	@Override
	public void displayAllAccounts() {
		System.out.println("All a/cs");
		for (BankAccount a : accounts)
			System.out.println(a);
	}

	@Override
	public void displayAccountSummary(int acctNo) throws BankingException {
		// get a/c details by it's acct no
		BankAccount acct = getAccountByAcctNo(acctNo);
		System.out.println(acct);
	}

	private BankAccount getAccountByAcctNo(int acctNo) throws BankingException {
		// create bank account instance to wrap PK(acct no)
		BankAccount myAcc = new BankAccount(acctNo);
//		for (BankAccount a : accounts)
//			 if(a != null && a.equals(myAcc))
//				return a;
		int index = accounts.indexOf(myAcc);// O(n)
		if (index == -1) // => invalid a/c no
			throw new BankingException("Invalid A/C No !!!!");
		return accounts.get(index);// O(1)
	}

	@Override
	public String withdraw(int acctNo, double amount) throws BankingException {
		BankAccount acct = getAccountByAcctNo(acctNo);
		// => a/c found
		validateBalance(acct.getAcType(), acct.getBalance() - amount);
		// => sufficient balance
		acct.setBalance(acct.getBalance() - amount);
		return "Withdrawn successfully, curnt balance " + acct.getBalance();
	}

	@Override
	public void sortAccountsByAccountNumber() {
		// sort acct list -
		Collections.sort(accounts);

	}

	@Override
	public String deposit(int acctNo, double amount) throws BankingException{
		BankAccount acct = getAccountByAcctNo(acctNo);
		// => a/c found
		acct.setBalance(acct.getBalance() + amount);
		return "Deposited successfully, curnt balance " + acct.getBalance();
	}

	@Override
	public String transferFunds(int srcAcNo, int destAcNo, double amount) throws BankingException {
		String withdrawMesg = withdraw(srcAcNo, amount);
		String depositMesg=deposit(destAcNo, amount);
		return "Transfer successful !";
	}

	@Override
	public void sortAccountsByBalance() {
		Collections.sort(accounts,
				new BankAccountBalanceComparator());		
	}

	@Override
	public void sortAccountByCustomerDob() {
		//dob - sorting criteria
		Collections.sort(accounts, new Comparator<BankAccount>() {

			@Override
			public int compare(BankAccount a1, BankAccount a2) {
				System.out.println("in compare - ano inner class");
				return a1.getDob().compareTo(a2.getDob());
					
			}
			
		}
				);
		
	}
	
	
	
	
	
	

}
