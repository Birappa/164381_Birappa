package com.birappa.bank;

public class CurrentAccount extends BankAccount{

	private double odLimit;
	
	{
		this.odLimit=20000;
	}
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		
	}
	public CurrentAccount(String accountHolderName, double accountBalance) {
		// TODO Auto-generated constructor stub
		super(accountHolderName, accountBalance);
	}
	
	public double getOdLimit() {
		return odLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		double remainingAmount;
		if(amount>(this.odLimit+this.accountBalance)){
			System.out.println("Don't have enough balance");
		}
		if(amount>this.accountBalance&&amount<(this.odLimit+this.accountBalance)){
			//System.out.println("hii");
			remainingAmount=amount-this.accountBalance;
			this.accountBalance=0;
			this.odLimit-=remainingAmount;
		}
		
	}
}
