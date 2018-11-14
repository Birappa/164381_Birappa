package com.sample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

	private int number;
	Scanner sc=new Scanner(System.in);
	
	public void getNumber(){
		System.out.println("Enter any Interger number to check Armstrong Number");
		number=sc.nextInt();	
	}
	
	/*public void displayResult(){
		boolean var=isArmstrongNumber();
		if(var)
			System.out.println(number+" is armstrong number");
		else
			System.out.println(number+" is not armstrong number");
	}
	*/
	public void findArmstrongNumbers(){
		ArrayList<Integer> armstrongNumbers=new ArrayList();
		boolean trueFalse;
		for(int i=100;i<=999;i++)
		{
			trueFalse=isArmstrongNumber(i);
			if(trueFalse)
				armstrongNumbers.add(i);
			
		}
		System.out.println("Following are the Armstrong Numbers");
		System.out.println(armstrongNumbers);
	}
	
	public boolean isArmstrongNumber(int num){
		
		int temp=num;
		int total=0;
		int digit;
		while(temp!=0){
			digit=temp%10;
			total+=Math.pow(digit, 3);
			temp=temp/10;
		}
		if(num==total)
			return true;
		else
			return false;
	}
	
	
}
