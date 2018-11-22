package com.date.service;

import java.awt.image.SampleModel;

import com.date.service.supp.MyDate;

public class DateDifferenceProvider {
	
	final int JAN=31;
	final int FEB=28;
	final int MAR=31;
	final int APR=30;
	final int MAY=31;
	final int JUN=30;
	final int JUL=31;
	final int AUG=31;
	final int SEP=30;
	final int OCT=31;
	final int NOV=30;
	final int DEC=31;
	
	int[] monthDays={JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	public int getDateDifference(MyDate startDate, MyDate endDate){ //This method return date difference.
		
		if(sameDay(startDate,endDate)&&sameMonth(startDate, endDate)&&sameYear(startDate, endDate)){
			return 0;
		}else if(sameMonth(startDate, endDate)&&sameYear(startDate, endDate)){
			return endDate.getDd()-startDate.getDd();
		}else if((!sameMonth(startDate, endDate))&& sameYear(startDate, endDate)){
			return remainingDaysOfMonth(startDate)+intervingMonthDays(startDate, endDate)+endDate.getDd();
		}else if(!sameYear(startDate, endDate)){
			return totalNumberOfDaysInDiffYear(startDate, endDate);
		}
		return 0;
	}
	
	public boolean sameDay(MyDate startDate, MyDate endDate){  //This method check is number of days are same.
		if(startDate.getDd()==endDate.getDd())
			return true;
		return false;
	}

	public boolean sameMonth(MyDate startDate, MyDate endDate){ //This method check is month same. 
		if(startDate.getMm()==endDate.getMm())
			return true;
		return false;
	}

	public boolean sameYear(MyDate startDate, MyDate endDate){ //This method check is year same.
		if(startDate.getYyyy()==endDate.getYyyy())
			return true;
		return false;
	}
	
	public boolean isLeapYear(int year){  //This method check is Leap Year.
		
		if(year%400==0||(year%4==0&&year%100!=0)){
			return true;
		}
		return false;
	}
	
	public boolean isFeb(int month){  //This method check is Feb month.
		if(month==2)
			return true;
		return false;
	}
	
	private int remainingDaysOfMonth(MyDate date){  //This method return remaining days in the month.
		if(isFeb(date.getMm())){
			if(isLeapYear(date.getYyyy())){
				return monthDays[date.getMm()-1]-date.getDd()+1;
			}
		}
		return monthDays[date.getMm()-1]-date.getDd();
	}
	
	private int intervingMonthDays(MyDate startDate, MyDate endDate){  //This method returns number of days in the interving months.
		int totalDays=0;
		for(int month=startDate.getMm()+1;month<endDate.getMm();month++){
			if(isFeb(month)){
				if(isLeapYear(startDate.getYyyy()))
					totalDays+=monthDays[month-1]+1;
				else
					totalDays+=monthDays[month-1];
			}
			else
				totalDays+=monthDays[month-1];
		}
		return totalDays;
	}
	
	private int totalNumberOfDaysInDiffYear(MyDate startDate, MyDate endDate){  //This method returns total number of days in the difference years.
		
		return remainingDaysOfMonth(startDate)+
				intervingMonthDays(startDate, new MyDate(31, 12+1, startDate.getYyyy()))+
				intervingYearDays(startDate, endDate)+
				intervingMonthDays(new MyDate(01, 0, endDate.getYyyy()), endDate)+
				endDate.getDd();
	}
	
	private int intervingYearDays(MyDate startDate, MyDate endDate){ //This method returns total number of days in the interving years.
		int totalDaysInYear=0;
		int yearDifference=endDate.getYyyy()-startDate.getYyyy();
		if(yearDifference>=2){
			for(int year=startDate.getYyyy()+1;year<endDate.getYyyy();year++){
				if(isLeapYear(year))
					totalDaysInYear+=366;
				else
					totalDaysInYear+=365;
			}
		}
		return totalDaysInYear;
	}
}
