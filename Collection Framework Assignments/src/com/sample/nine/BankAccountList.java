package com.sample.nine;

import java.util.HashSet;
import java.util.Iterator;

public class BankAccountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<SavingAccount> bank=new HashSet<SavingAccount>();
		System.out.println(bank.add(new SavingAccount("Birappa", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Roshan", 60000, true)));
		System.out.println(bank.add(new SavingAccount("Birappa", 50000, true)));
		
		Iterator<SavingAccount> iterator=bank.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getAccountHolderName());
		}
	}

}
