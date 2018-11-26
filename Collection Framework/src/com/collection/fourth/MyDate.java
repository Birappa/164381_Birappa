package com.collection.fourth;


import java.util.HashMap;
import java.util.Iterator;

import java.util.Set;

public class MyDate {

	private DateClass date;
	private String name;
	private HashMap<DateClass, String> hashMap;
	
	
	
	public boolean add(DateClass date, String name){
		this.date = date;
		this.name = name;
		if(hashMap==null)
			hashMap=new HashMap<DateClass, String>();
		try{
			hashMap.put(this.date, this.name);
			return true;
		}catch(Exception e){
			System.out.println("Duplicates are not allowed");
			return false;
		}
		
	}
	
	public String get(DateClass key){
		int count=0;
		Set<DateClass> keySet=hashMap.keySet();
		Iterator<DateClass> iterator=keySet.iterator();
		//System.out.println(iterator.hasNext());
		while(iterator.hasNext()){
			
			DateClass keyDate=iterator.next();
			//System.out.println(keyDate.toString());
			if(isSameDay(key, keyDate)&&isSameMonth(key, keyDate)){
				count++;
				//System.out.println("Get Method Fails");
			}		
		}
		//System.out.println(count);
		if(count<=1){
			return hashMap.get(key);
		}
		
		return "get fails";
	}
	
	private boolean isSameDay(DateClass date, DateClass keyDate){
		if(date.getDay()==keyDate.getDay())
			return true;
		return false;
	}
	
	private boolean isSameMonth(DateClass date, DateClass keyDate){
		if(date.getMonth()==keyDate.getMonth())
			return true;
		return false;
	}
	
	/*private boolean isSameYear(DateClass date, DateClass keyDate){
		if(date.getYear()==keyDate.getYear())
			return true;
		return false;
	}*/
}
