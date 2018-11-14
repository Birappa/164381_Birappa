package com.sample;

public class Five {

	public void printNum(){
		for(int i=1;i<=10;i++)
			System.out.print(i+", ");
		System.out.println();
	}
	
	public void printNumReverse(){
		for(int i=10;i>=1;i--)
			System.out.print(i+", ");
		System.out.println();

	}
	
	public void printEvenNum(){
		for(int i=1;i<=10;i++){
			if(i%2==0)
				System.out.print(i+", ");
		}
		System.out.println();
	}
	
	public void printOddNum(){
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				System.out.print(i+", ");
		}	
		System.out.println();
	}
	
	public void printSumOfNum(){
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
				System.out.print(i+" + ");
		}	
		System.out.print(" = "+sum);
		
	}
}
