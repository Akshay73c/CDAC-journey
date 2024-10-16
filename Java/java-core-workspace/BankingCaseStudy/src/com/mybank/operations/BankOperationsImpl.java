package com.mybank.operations;

import static com.mybank.validations.BankingValidations.parseAndValidateDate;
import static com.mybank.validations.BankingValidations.parseBankAccountType;
import static com.mybank.validations.BankingValidations.validateBalance;
import static com.mybank.validations.BankingValidations.accountExists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;
import com.mybank.custom_exceptions.BankingException;
import com.mybank.custom_ordeing.BankAccountBalanceComparator;
import com.mybank.custom_ordeing.BankAccountDobComparator;

//Implementation class of BankOperations interface
public class BankOperationsImpl implements BankOperations {
	// state (non static data members)
	private List<BankAccount> accounts;// mem allocated in -stack - for reference accounts. List, BankAccount loaded in metaspace 

	public BankOperationsImpl() {
		accounts = new ArrayList<>();// size=0, init capa=10 //mem allocated for the object in heap and referred it back to accounts
		//populate list
		BankAccount a1 = new BankAccount(101, BankAccountType.SAVING, 15000,"a1","b1",LocalDate.parse("1990-12-17"));
		BankAccount a2 = new BankAccount(10, BankAccountType.SAVING, 17000,"a2","b2",LocalDate.parse("1993-12-17"));
		BankAccount a3 = new BankAccount(55, BankAccountType.CURRENT, 6000,"a3","b3",LocalDate.parse("1991-10-17"));
		BankAccount a4 = new BankAccount(20, BankAccountType.FD, 150000,"a4","b4",LocalDate.parse("1989-12-07"));
		BankAccount a5 = new BankAccount(81, BankAccountType.LOAN, 200000,"a5","b5",LocalDate.parse("1991-02-15"));
		BankAccount a6 = new BankAccount(62, BankAccountType.SAVING, 12000,"a6","b6",LocalDate.parse("1990-12-18"));
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
		//check first if account already present
		accountExists(acctNo, accounts);
		// means => no duplicate
		
		// validate i/ps - balance , actype
		BankAccountType accountType=
				parseBankAccountType(acType);
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
		System.out.println(accounts);
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

		int index = accounts.indexOf(myAcc);// O(n) //internally calls equals(). Put debugger @equals() and observe
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
	
	public String deposit(int acctNo, double amount) throws BankingException {
		BankAccount acct = getAccountByAcctNo(acctNo);
		// => a/c found, and no validation needed here.
		acct.setBalance(acct.getBalance() + amount);
		return "Deposited successfully, curnt balance " + acct.getBalance();
	}

	@Override
	public void sortAccountsByAccountNumber() {
		//sort acct list - 
		Collections.sort(accounts);
		
	}

	@Override
	public void transferFund(int accNo1, int accNo2, double amount) throws BankingException{
//		BankAccount acct1 = getAccountByAcctNo(accNo1);
//		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//		System.out.println(acct1);
		try {
			withdraw(accNo1, amount);
			deposit(accNo2, amount);
			System.out.println("Transfer success!!");
		} catch(BankingException e) {
//			System.out.println("Came heer");
			//bug here. if acct1 is invalid, it ofc come here only but it again searches for acct1 which should not happen
			//like this deposit should be for only the case when acct2 is invalid
			//soln?? - specific exceptions for each case and then multiple catch blocks ?
			deposit(accNo1, amount);
//			e.printStackTrace();
			System.out.println(e.getMessage() + " " + e.getStackTrace());
		}
		
	}

	@Override
	public void sortAccountsByBalanace() {
		Collections.sort(accounts, new BankAccountBalanceComparator());
		
	}
	
	//getAccountsByType
	public void displayAccountsByType(String accType) {
		ArrayList<BankAccount> typedAccounts = getAccountsByType(accType);
		System.out.println(typedAccounts);
	}
	
	//private method to get accts by type
	private ArrayList<BankAccount> getAccountsByType(String accType) {
		ArrayList<BankAccount> typedAccounts = new ArrayList<BankAccount>();
		BankAccountType parsedAccType = parseBankAccountType(accType);
		//no err means parsedVal is correct
		for (BankAccount a : accounts) {
			if (a.getAcType().equals(parsedAccType)) {
				typedAccounts.add(a);
			}
		}
		return typedAccounts;
	}
	
	//close account
	public void closeAccount(int acctNo) throws BankingException {
		//first check if valid accountNo i.e if accountExists
		BankAccount acctToDel = getAccountByAcctNo(acctNo);
		accounts.remove(acctToDel);
		System.out.println("Account closed!!");
	}

	@Override
	public void sortAccountsByDob() {
		//update req: Use anonymous inner class
		Collections.sort(accounts, new BankAccountDobComparator());
		
	}
	
	//Method to close accts by type n date
	public void closeAcctsByTypenDate(String accType, String date) {
		ArrayList<BankAccount> typedAccounts = getAccountsByType(accType);
		for (BankAccount a : typedAccounts) {
		//?? we haven't stored createdAt date field.
		}
	}
	

}
