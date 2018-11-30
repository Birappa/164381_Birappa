package com.sample.stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;






import com.sample.classes.Fruit;
import com.sample.classes.News;
import com.sample.classes.Trader;
import com.sample.classes.Transaction;

public class Tester  {

	//List list=null;
	public static void main(String[] args) {
		Tester tester=new Tester();
		
		
		List<Fruit> fruits=new ArrayList<Fruit>();
		tester.addFruits(fruits);
		
		//Assignment 1
		//fruits.stream().filter(s-> s.getCalories()<100).forEach(System.out::println);
		
		// Assignment 2
		//fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(f->System.out.println(f.getName()+" "+f.getColor()));
		
		// Assignment 3
		//fruits.stream().filter(f->f.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(f->System.out.println(f.getName()+" "+f.getColor()));
		
		List<Transaction> news=new ArrayList<Transaction>();
		tester.addTransaction(news);
		
		// Assignment 8
		//news.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		
		//news.stream().
	}

	public void addFruits(List<Fruit> list){
		
		list.add(new Fruit("Apple", 200, 200, "Red"));
		list.add(new Fruit("Orange", 300, 100, "Orange"));
		list.add(new Fruit("Mango", 80, 150, "Yellow"));
		list.add(new Fruit("Banana", 50, 80, "Yellow"));
	}
	

	public void addNews(List<News> list){
		
		list.add(new News(1, "Birappa", "Birappa", "Very good Article"));
		list.add(new News(2, "Prathyusha", "Prathyusha", "Very bad Article"));
		list.add(new News(3, "Birappa", "Birappa", "Very good Article"));
		list.add(new News(4, "Birappa", "Birappa", "Very good Article"));
	}
	
public void addTransaction(List<Transaction> list){
		
		list.add(new Transaction(new Trader("Birappa","Solapur"),2011,10000));
		list.add(new Transaction(new Trader("Prathyusha","Tirupati"),2011,20000));
		list.add(new Transaction(new Trader("Ashna","Pune"),2018,50000));
		list.add(new Transaction(new Trader("Roshan","Mumbai"),2015,10000));
		
	}
	
}
