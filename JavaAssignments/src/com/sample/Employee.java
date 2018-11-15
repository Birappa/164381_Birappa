package com.sample;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmpData ed=new EmpData(11,"Birappa",23);
		//ed.displayEmpDetails();
		
		//-------- Assignments given by Shashi -----
		
		/*Five five=new Five();
		five.printNum();
		five.printNumReverse();
		five.printEvenNum();
		five.printOddNum();
		five.printSumOfNum();*/
		
		//-----Assignments from pdf ---------
		
		/* ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		//System.out.println(armstrongNumber.isArmstrongNumber(153));
		armstrongNumber.findArmstrongNumbers();*/
		
		//---------Interest--------
		/*Interest interest=new Interest();
		System.out.println(interest.findSimpleInterest(10000, 10, 2));
		System.out.println(interest.findCompoundInterest(10000, 10, 2));*/
		
		//------Result---------
		
		/*Result result=new Result();
		result.getResult(67, 66, 68);*/
		
		//------------Income Tax ------
		/*IncomeTax incomeTax=new IncomeTax();
		System.out.println(incomeTax.findTaxAmount(500000));*/
		
		//-------Array Assignment Searching number-------
		MyArray myArray=new MyArray();
		//myArray.getArrayNumbers();
		//myArray.searchNumber(53);
		//myArray.ascendingSort();
		//myArray.descendingSort();
		//myArray.displayArray();
		Sorting sorting=new Sorting();
		sorting.displayArray(myArray.intArray);
		sorting.bubbleSort(myArray.intArray);
		sorting.displayArray(myArray.intArray);
		
	}

}
