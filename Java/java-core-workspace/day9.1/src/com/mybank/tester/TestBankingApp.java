package com.mybank.tester;

import java.util.Scanner;

import com.mybank.operations.BankOperations;
import com.mybank.operations.BankOperationsImpl;

public class TestBankingApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter max no of accounts");
			BankOperations ops = new BankOperationsImpl(sc.nextInt());
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1. Open A/C \n" + "2. Display all\n" + "3.Fetch acc by Acc no" +" 0. Exit");
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
						
					case 3: // display all
						System.out.println("Enter acc No");
						ops.fetchAccSummary(sc.nextInt());
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();	//to read off pending input tokens from the scanner

				}
			}

		}

	}

}
