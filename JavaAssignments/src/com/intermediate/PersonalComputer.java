package com.intermediate;

public class PersonalComputer {

	public static void main(String[] args) {
		
		
		Printer pc1 = Printer.getInstance();
		Printer pc2 = Printer.getInstance();
		Printer pc3 = Printer.getInstance();
		System.out.println(pc1.hashCode());
		System.out.println(pc2.hashCode());
		System.out.println(pc3.hashCode());
		pc1.givePrint(4);
		pc2.givePrint(1);
		Printer.getPrint();
		pc3.givePrint(5);
		Printer.getPrint();
	}
}
