package com.sample.stream;


import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;







import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sample.classes.Fruit;
import com.sample.classes.News;
import com.sample.classes.Trader;
import com.sample.classes.Transaction;

public class Tester  {

	//List list=null;
	public static void main(String[] args) {
		Tester tester=new Tester();
		
		
		/*List<Fruit> fruits=new ArrayList<Fruit>();
		tester.addFruits(fruits);
		
		//Assignment 1
		fruits.stream().filter(s-> s.getCalories()<100).forEach(System.out::println);
		
		// Assignment 2
		fruits.stream().sorted(Comparator.comparing(Fruit::getColor)).forEach(f->System.out.println(f.getName()+" "+f.getColor()));
		
		// Assignment 3
		fruits.stream().filter(f->f.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(f->System.out.println(f.getName()+" "+f.getColor()));
		*/
		
		
		//--------News Assignments----------- 
		List<News> news=new ArrayList<News>();
		tester.addNews(news);
		
		Map<Object, Long>group= news.stream().collect(Collectors.groupingBy(n->n.getNewsId(),Collectors.counting()));
		//group.stream().
		//--------Assignment 5------
		//System.out.println(news.stream().filter(x -> x.getComment().contains("Budget")).count());
		
		
		List<Transaction> transactions=new ArrayList<Transaction>();
		tester.addTransaction(transactions);
		
		// Assignment 8
		//news.stream().filter(t->t.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);
		
		// Assignment 10
		Comparator<Transaction> sortByName=(Transaction name1, Transaction name2)->name1.getTrader().getName().compareTo(name2.getTrader().getName());
		transactions.stream().filter(f->f.getTrader().getCity().equals("Pune")).sorted(sortByName).forEach(System.out::println);
		
		List<Trader> traders=new ArrayList<Trader>();
		tester.addTraders(traders);
		// Assignment 11 complete
		//traders.stream().sorted(Comparator.comparing(Trader::getName)).forEach(System.out::println);
		
		// Assignment 12 complete
		//traders.stream().filter(T->T.getCity().equals("Indore")).forEach(System.out::println);
		
		// Assignment 13 incomplete
		//transactions.stream().filter(t->t.getTrader().getCity().equals("Delhi")).forEach(f->System.out.println(t->t.getValue()));
		
		//Assignment 14 & 15 Complete
		Comparator<Transaction> comp=(t1,t2)->Integer.compare(t1.getValue(), t2.getValue());
		System.out.println(transactions.stream().max(comp).get());
		System.out.println(transactions.stream().min(comp).get());
		System.out.println(transactions.stream().mapToInt(Transaction::getValue).max());
		System.out.println(transactions.stream().map(Transaction::getValue).reduce(Integer::max));
	}

	public void addFruits(List<Fruit> list){
		
		list.add(new Fruit("Apple", 200, 200, "Red"));
		list.add(new Fruit("Orange", 300, 100, "Orange"));
		list.add(new Fruit("Mango", 80, 150, "Yellow"));
		list.add(new Fruit("Banana", 50, 80, "Yellow"));
	}
	

	public void addNews(List<News> list){
		
		list.add(new News(1, "Birappa", "Birappa", "Very good Article"));
		list.add(new News(1, "Prathyusha", "Prathyusha", "Very bad Article"));
		list.add(new News(2, "Birappa", "Birappa", "Wonderful"));
		list.add(new News(4, "Birappa", "Birappa", "Very Informative"));
		list.add(new News(4, "Ashna", "Ashna", "Helping lot"));
		list.add(new News(1, "Roshan", "Roshan", "Very Cool"));
		list.add(new News(3, "Prathyusha", "Prathyusha", "Very nice"));
	}
	
public void addTransaction(List<Transaction> list){
		
		list.add(new Transaction(new Trader("Birappa","Solapur"),2011,10000));
		list.add(new Transaction(new Trader("Prathyusha","Tirupati"),2011,20000));
		list.add(new Transaction(new Trader("Ashna","Pune"),2018,50000));
		list.add(new Transaction(new Trader("Roshan","Mumbai"),2015,10000));
		list.add(new Transaction(new Trader("Naman","Delhi"),2018,50000));
		list.add(new Transaction(new Trader("Rohan","Delhi"),2018,70000));
		
	}
	
public void addTraders(List<Trader> list){
	
	list.add(new Trader("Birappa","Solapur"));
	list.add(new Trader("Ashna","Pune"));
	list.add(new Trader("Prathyusha","Tirupati"));
	list.add(new Trader("Roshan","Dhanur"));
	list.add(new Trader("Arihant","Indore"));
	list.add(new Trader("Naman","Delhi"));
	list.add(new Trader("Rohan","Delhi"));
}
}
