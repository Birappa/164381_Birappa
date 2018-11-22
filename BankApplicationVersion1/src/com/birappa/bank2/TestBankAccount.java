package com.birappa.bank2;
import com.birappa.bank.*;
public class TestBankAccount {
	public static void testBankAccountMethod(){
		//BankAccount bankAccount=new BankAccount();
		//bankAccount.setAccountHolderName("Birappa");
		
	}

	public static void testSavingAccount(){
		SavingAccount savingAccount=new SavingAccount("Birappa", 5000);
		System.out.println("Account No is : "+savingAccount.getAccountNo());
		System.out.println("Account Holder Name is : "+savingAccount.getAccountHolderName());
		System.out.println("Account Balance is : "+savingAccount.getAccountBalance());
		savingAccount.deposit(5000);
		System.out.println("Account Balance is : "+savingAccount.getAccountBalance());
		System.out.println("=================");
		savingAccount.withdraw(3000);
		System.out.println("Account Balance is : "+savingAccount.getAccountBalance());
	}
	
	public static void testCurrentAccount(){
		CurrentAccount currentAccount=new CurrentAccount("Patil",40000);
		System.out.println("Account Holder Name is : "+currentAccount.getAccountHolderName());
		System.out.println("Account No is : "+currentAccount.getAccountNo());
		System.out.println("Account Balance is : "+currentAccount.getAccountBalance());
		//currentAccount.deposit(5000);
		//System.out.println("Account Balance is : "+currentAccount.getAccountBalance());
		System.out.println("=================");
		currentAccount.withdraw(50000);
		System.out.println("Account Balance is : "+currentAccount.getAccountBalance());
		System.out.println("Over Draft Limit is : "+currentAccount.getOdLimit());
	}
	
	public static BankAccount getBankAccount(String accoutType){
		
		BankAccount acc=null;
		if(accoutType.equals("Saving")){
			acc= new SavingAccount("BIrappa",4000);
		}
		else if(accoutType.equals("Current")){
			acc=new CurrentAccount("Rohan",7000) ;
		}
		else{
			acc=null;
		}
		return acc;
	}
	
	public static void main(String[] args) {
		
		/*//testBankAccountMethod();
		testSavingAccount();
		testCurrentAccount();*/
		
		/*BankAccount acc=getBankAccount("Saving");
		System.out.println();*/
		
		SavingAccount2 acc=new SavingAccount2();
		acc.deposit(4000);
		acc.withdraw(1000);
		System.out.println("Salary Account : "+acc.isSalaryAccount());
		System.out.println("Insurance : "+acc.getInsuranceName());
	}
}
