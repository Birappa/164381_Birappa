package com.sample.forth;

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
		return  day + " - " + month + " - " + year;
	}

	@Override
	public boolean equals(Object arg0) {
	
		DateClass obj=(DateClass)arg0;
		return day==obj.day&&month==obj.month&&year==obj.year;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.day+this.month+this.year;
	}
	
	
	
}