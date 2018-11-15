package com.sample;

import java.util.Scanner;

public class MyArray {
	Scanner sc;
	int intArray[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	/*public MyArray(){
		this.getArrayNumbers();
	}*/
	public void getArrayNumbers(){
		intArray=new int[15];
		sc=new Scanner(System.in);
		System.out.println("Enter 15 numbers");
		for(int i=0;i<15;i++){
			intArray[i]=sc.nextInt();
		}
	}

	void ascendingSort() 
	{ 
		int n = intArray.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (intArray[j] > intArray[j+1]) 
				{ 
					// swap temp and arr[i] 
					int temp = intArray[j]; 
					intArray[j] = intArray[j+1]; 
					intArray[j+1] = temp; 
				} 
	} 
	
	void descendingSort() 
	{ 
		int n = intArray.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = n-1; j > i; j--) 
				if (intArray[j-1] < intArray[j]) 
				{ 
					// swap temp and arr[i] 
					int temp = intArray[j]; 
					intArray[j] = intArray[j-1]; 
					intArray[j-1] = temp; 
				} 
	} 
	

	public void searchNumber(int number){
		boolean contains=false;
		int i;
		for(i=0;i<15;i++){
			if(number==intArray[i]){
				contains = true;
				break;
			}	
		}
		if(contains)
			System.out.println("Number found at index: "+i);
		else
			System.out.println("Number is not found");
	}
	
	public void displayArray(){
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
	}
	
	
}
