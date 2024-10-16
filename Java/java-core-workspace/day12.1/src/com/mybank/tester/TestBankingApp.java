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
						+ "5. Sort bank accounts as per acct no (asc)\n "
						+"6. Transfer Funds\n"
						+"7. Sort accts as per balance (desc)\n"
						+"8. Sort accts as per Customer's DoB (asc)\n"
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
						ops.sortAccountsByAccountNumber();
						break;
					case 6: // transfer funds
						System.out.println("Enter src a/c no  , dest a/c no  n transfer amount");
						System.out.println(ops.transferFunds(sc.nextInt(),sc.nextInt(),sc.nextDouble()));
						break;
					case 7 :
						ops.sortAccountsByBalance();
						break;
					case 8 :
						ops.sortAccountByCustomerDob();
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();// to read off pending input tokens from the scanner
				}
			}

		}

	}

}
