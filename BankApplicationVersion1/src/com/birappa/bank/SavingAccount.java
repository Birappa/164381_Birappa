package com.birappa.bank;

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
}
