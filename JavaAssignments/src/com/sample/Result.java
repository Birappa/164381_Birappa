package com.sample;

public class Result {

	
	public void getResult(int mark1, int mark2, int mark3){
		if(mark1>60&&mark2>60&&mark3>60)
			System.out.println("passed");
		else if(mark1>60&&mark2>60||mark1>60&&mark3>60||mark2>60&&mark3>60)
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}
}
