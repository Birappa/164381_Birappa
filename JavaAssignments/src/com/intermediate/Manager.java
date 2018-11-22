package com.intermediate;

import java.util.Scanner;

public class Manager extends Employee {

	Scanner sc=new Scanner(System.in);
	private final double PERCENT;
	private double incentive;
	private boolean isProductDeliveredSuccessfully;
	private double projectCost;
	public Manager(String name, double salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
		PERCENT=0.05;
		this.projectCost=0;
		isProductDeliveredSuccessfully=false;
	
	}

	
	@Override
	public void calculateTotalSalary() {
		// TODO Auto-generated method stub
		this.isProductDeliveredSuccessfully=isProductDeliveredSuccessfully();
		if(this.isProductDeliveredSuccessfully){
			this.projectCost=takeProjectCost();
			this.incentive=calculateIncentive();
			
			this.employeeTotalSalary=this.employeeBasicSalary+this.incentive;
		}
		else
			this.employeeTotalSalary=this.employeeBasicSalary;
		
	}

	private boolean isProductDeliveredSuccessfully() {
		System.out.println("Are you delivered product successfully?(yes/no) :");
		String yesNo=sc.next();
		boolean trueFalse;
		if(yesNo.compareTo("yes")==0)
			trueFalse=true;
		else
			trueFalse=false;
		
		return trueFalse;
	}
	
	public double getProjectCost() {
		return projectCost;
	}
	
	private  double takeProjectCost(){
		
		System.out.println("Enter your Project Cost : ");
		double cost=sc.nextDouble();		
		return cost;
	}
	
	private double calculateIncentive(){	
		return this.projectCost*this.PERCENT;
	}
	
	public double getIncentive() {
		return incentive;
	}
}
