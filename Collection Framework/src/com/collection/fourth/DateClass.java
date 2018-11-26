package com.collection.fourth;

public class DateClass {

	
	private int day;
	private int month;
	private int year;
	public DateClass(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "DateClass [day=" + day + ", month=" + month + ", year=" + year
				+ "]";
	}

	/*@Override
	public int compareTo(DateClass arg0) {
		// TODO Auto-generated method stub
		if(this.day==arg0.day && this.month==arg0.month && this.year==arg0.year)
			return 0;
		return -1;
		
	}*/
	
}
