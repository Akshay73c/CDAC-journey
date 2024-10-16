package com.myBank.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.myBank.core.BankAccount;
import com.myBank.core.BankAccountType;

public class TestBank {

	public static void main(String[] args) {
//		try(Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter details as accNo, Balance, Fname, Lname, DOB, AccType\n");
//			BankAccount account = new BankAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), LocalDate.parse(sc.next()), BankAccountType.valueOf(sc.next().toUpperCase()));
//			
//			System.out.println(account);
//			
//			BankAccount accoun1 = new BankAccount(sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), LocalDate.parse(sc.next()), BankAccountType.valueOf(sc.next().toUpperCase()));
//			System.out.println(accoun1);
//			System.out.println(account == accoun1); //false
//			System.out.println(account.equals(accoun1)); //false coz this rn, is calling equals of Object, which is checking ref equality.
////			need to override equals such that gives true iff accNos are same
//			
//			
//			
//		}//Jvm autocloses scanner
//		catch(Exception e) {
//			e.printStackTrace();
//		}

	}

}
