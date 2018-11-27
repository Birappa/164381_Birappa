package com.sample.nine;

public class SavingAccount extends BankAccount {

	private boolean isSalaryAccount;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
		this.isSalaryAccount=true;
	}
	public SavingAccount(String accountHolderName, double accountBalance) {
		// TODO Auto-generated constructor stub
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	
	public SavingAccount(String accountHolderName, double accountBalance,boolean isSalaryAccount) {
		// TODO Auto-generated constructor stub
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		super.withdraw(amount);
	}
	/*@Override
	public int compareTo(SavingAccount arg0) {
		// TODO Auto-generated method stub
		if(this.getAccountNo()>arg0.getAccountNo())
			return 1;
		else if(this.getAccountNo()<arg0.getAccountNo())
			return -1;
		else
			return 0;
	}*/
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int total=0;
		for(char c:this.getAccountHolderName().toLowerCase().toCharArray())
			total+=c;
		System.out.println(total);
		return total;
	}
}