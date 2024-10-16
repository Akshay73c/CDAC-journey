package com.mybank.tester;

import java.time.LocalDate;
import java.util.Scanner;

import com.mybank.core.BankAccount;
import com.mybank.core.BankAccountType;

/*
 * Create a SIMPLE tester 
Accept bank a/c details from user.
Create bank a/c instance
Display it's details
 */
public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter a/c details - "
					+ "acctNo,  acType,balance, firstName, "
					+ " lastName, dob(yyyy-MM-dd)");
			Object account1=new BankAccount(
					sc.nextInt(), 
					BankAccountType.valueOf(sc.next().toUpperCase())
					, sc.nextDouble(), sc.next(), 
					sc.next(), LocalDate.parse(sc.next()));
			System.out.println(account1);
			System.out.println("Enter a/c details - "
					+ "acctNo,  acType,balance, firstName, "
					+ " lastName, dob(yyyy-MM-dd)");
			Object account2=new BankAccount(
					sc.nextInt(), 
					BankAccountType.valueOf(sc.next().toUpperCase())
					, sc.nextDouble(), sc.next(), 
					sc.next(), LocalDate.parse(sc.next()));
			System.out.println(account2);
			System.out.println(account1==account2);//false
			System.out.println(account1.equals(account2));
			String s="123456";
			System.out.println(account1.equals(s));
			//true  iff acct nos are same
		}//JVM - sc.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
