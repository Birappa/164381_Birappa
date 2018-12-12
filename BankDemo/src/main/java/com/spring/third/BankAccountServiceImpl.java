package com.spring.third;


public class BankAccountServiceImpl implements BankAccountService  {

	BankAccountRepositoryImpl bankAccountRepositoryImpl=null;
	public BankAccountServiceImpl() {
		
	}

	public BankAccountServiceImpl(
			BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		super();
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	@Override
	public double withdraw(long accountId, double balance) {
	
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "withdraw");
	}

	@Override
	public double deposit(long accountId, double balance) {
		return bankAccountRepositoryImpl.updateBalance(accountId, balance, "deposit");
		
	}

	@Override
	public double getBalance(long accountId) {
		
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		double account1=withdraw(fromAccount, amont);
		if(account1!=0){
			double account2=deposit(toAccount, amont);
			if(account2!=0){
				return true;
			}
			deposit(fromAccount, amont);
		}
		return false;
	}

	
}
