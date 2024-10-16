package com.mybank.custom_ordeing;

import java.util.Comparator;

import com.mybank.core.BankAccount;

public class BankAccountBalanceComparator implements Comparator<BankAccount> {

	//compares BankAccounts in descending order by AcctNo
	@Override
	public int compare(BankAccount a1, BankAccount a2) {
		System.out.println("Comparing bank accounts in desc order by AcctNo");
		if (a1.getBalance() > a2.getBalance())
			return -1;
		if (a1.getBalance() < a2.getBalance())
			return 1;
		return 0;
	}

}
