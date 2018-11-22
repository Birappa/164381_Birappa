package com.birappa.bank;

public class SavingAccount2 extends SavingAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan Bima";
	}

	@Override
	public double getIsuranceAmount() {
		// TODO Auto-generated method stub
		return 500000;
	}
	

}
