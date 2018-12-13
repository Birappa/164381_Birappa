package com.spring.third;


import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	List<BankAccount> accounts=null;
	
	public BankAccountRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public BankAccountRepositoryImpl(List<BankAccount> accounts) {
		super();
		this.accounts = accounts;
	}
	
	@Override
	public double getBalance(long accountId) {
	BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null)
		return account.getAccountBalance();
		
		return 0;
	}

	

	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		BankAccount account=getBeanOfBankAccount(accountId);
		if(account!=null){
			account.setAccountBalance(newBalance);	
			return account.getAccountBalance();	
		}
		return 0;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	private BankAccount getBeanOfBankAccount(long accountId){
		if(accounts!=null){
			for(BankAccount account:accounts ){
				if(account.getAccountId()==accountId){
					return account;
				}
			}
		}
		return null;
	}
	
}
