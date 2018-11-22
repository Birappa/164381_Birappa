package com.intermediate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager manager=new Manager("Chaitali", 50000);
		manager.calculateTotalSalary();
		System.out.println(manager.getEmployeeBasicSalary());
		System.out.println(manager.getIncentive());
		System.out.println(manager.getEmployeeTotalSalary());
		
	}

}
