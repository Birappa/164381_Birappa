package com.sample;

public class EmpData {
	private int empId;
	private String empName;
	private int age;
	private int mobNo;
	private String designation;
	private String email;
	
	public EmpData(int id, String name, int age){
		this.empId=id;
		this.empName=name;
		this.age=age;
		this.mobNo=1234;
		this.designation="Analyst";
		this.email="abc@gmail.com";
	}
	public void displayEmpDetails(){
		System.out.println(this.empId);
		System.out.println(this.empName);
		System.out.println(this.age);
		System.out.println(this.mobNo);
		System.out.println(this.designation);
		System.out.println(this.email);
	}

}
