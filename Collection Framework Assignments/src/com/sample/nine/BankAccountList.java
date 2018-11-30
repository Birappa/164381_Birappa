package com.sample.nine;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<SavingAccount> bank=new HashSet<SavingAccount>();
		System.out.println(bank.add(new SavingAccount("Birappa", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Roshan", 60000, true)));
		System.out.println(bank.add(new SavingAccount("Birappa", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Pradeep", 70000, true)));
		
		Set<SavingAccount> sorted=new TreeSet<SavingAccount>(bank);
		
		Iterator<SavingAccount> iterator=sorted.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getAccountHolderName());
		}
	}

}
