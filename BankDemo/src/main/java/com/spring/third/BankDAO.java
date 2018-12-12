package com.spring.third;

import java.util.ArrayList;
import java.util.List;

public class BankDAO {

	private List<BankAccount> bankCustomer;
	public BankDAO() {
		bankCustomer=new ArrayList<BankAccount>();
	}

	public boolean addBankCustomer(BankAccount account){
		
		return bankCustomer.add(account);
	}

	public List<BankAccount> getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(List<BankAccount> bankCustomer) {
		this.bankCustomer = bankCustomer;
	}

	@Override
	public String toString() {
		return "BankDAO [bankCustomer=" + bankCustomer + "]";
	}
	
	
}
