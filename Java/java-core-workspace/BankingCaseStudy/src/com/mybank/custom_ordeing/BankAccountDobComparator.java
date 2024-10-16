package com.mybank.custom_ordeing;

import java.util.Comparator;

import com.mybank.core.BankAccount;

//created to compare BankAccount by DOB
public class BankAccountDobComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount acct1, BankAccount acct2) {
		if (acct1.getDob().isBefore(acct2.getDob())) 
			//means a1 is younger, means a1 < a2 so, ret -ve val
			return -1;
		if (acct1.getDob().isAfter(acct2.getDob())) 
			return 1;
		
		return 0;
	}

}
