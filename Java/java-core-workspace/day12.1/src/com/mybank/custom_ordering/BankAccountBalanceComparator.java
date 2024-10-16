package com.mybank.custom_ordering;

import java.util.Comparator;

import com.mybank.core.BankAccount;

public class BankAccountBalanceComparator
implements Comparator<BankAccount> {
	@Override
	public int compare(BankAccount a1, BankAccount a2) {
		System.out.println("in compare - desc a/c bal");
		if(a1.getBalance() < a2.getBalance())
			return 1;
		if(a1.getBalance()==a2.getBalance())
			return 0;
		return -1;
		

	}
}
