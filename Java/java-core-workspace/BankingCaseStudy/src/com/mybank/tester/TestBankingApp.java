package com.mybank.tester;

import java.util.Scanner;

import com.mybank.operations.BankOperations;
import com.mybank.operations.BankOperationsImpl;

public class TestBankingApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			BankOperations ops = new BankOperationsImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Open A/C \n" + "2. Display all \n" + "3. Fetch A/c Summary\n "
						+ "4. Withdraw \n "
						+ "5. Sort bank accounts \n "
						+ "6. Funds transfer \n "
						+ "7. Sort bank accounts desc \n "
						+ "8. Sort by DOB \n "
						+ "9. Display names of accounts of specified account type \n "
						+ "10. Close account \n "
						+ "0. Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter a/c details -  " + "acctNo, acType,  balance,  firstName ,lastName,	dob");
						System.out.println(ops.openBankAccount(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), sc.next()));
						break;
					case 2: // display all
						ops.displayAllAccounts();
						break;
					case 3: // fetch particular a/c summary
						System.out.println("Enter a/c no ");
						ops.displayAccountSummary(sc.nextInt());
						break;
					case 4: // withdraw funds
						System.out.println("Enter a/c no n withdraw amount");
						System.out.println(ops.withdraw(sc.nextInt(),sc.nextDouble()));
						break;
					case 5 :
						//sort by acctNo
						ops.sortAccountsByAccountNumber();
						break;
					case 6 :
						//transfer funds
						System.out.println("Enter fromAccNo1, toAccNo2 and amount to transfer");
						ops.transferFund(sc.nextInt(), sc.nextInt(), sc.nextDouble());
						break;
					case 7 :
						//sort by balance
						ops.sortAccountsByBalanace();
						break;
						
					case 8 :
						//sort by DOB
						ops.sortAccountsByDob();
						break;
					case 9 :
						//accnts of specified type
						System.out.println("Enter account type you wanna see: ");
						ops.displayAccountsByType(sc.next());
						break;
					case 10:
						//close acct
						System.out.println("Enter acc No of account to close:");
						ops.closeAccount(sc.nextInt());
						break;
					case 11:
						//close accts of specific type and after a date
						System.out.println("Enter acc type of accounts to close and date:");
						ops.closeAcctsByTypenDate(sc.next(), sc.next());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();// to read off pending input tokens from the scanner. 
								  //it's pending coz in case of wrong input, Scanner throws exception and hadn;t read the data //
				}
			}

		}

	}

}
