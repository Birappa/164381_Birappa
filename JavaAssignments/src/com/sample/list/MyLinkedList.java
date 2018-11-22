package com.sample.list;

import java.util.LinkedList;

public class MyLinkedList implements MyList{

	Node head, last;

	static int count;
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		count=0;
	}

	 static class Node { 

	        int data; 
	        int index;
	        Node next; 

	        Node(int d)  { data = d;  next=null; }

	    } 

	




	@Override

	public boolean add(int number) {

		// TODO Auto-generated method stub

		try {

		if(head==null) {

			head=new Node(number);

			last=head;

			return true;

		}

		else {

			Node temp=new Node(number);

			last.next=temp;

			last=temp;

			return true;

		}

		}catch (Exception e) {

			// TODO: handle exception

			return false;

		}

	}



	@Override

	public int get(int index) {

		// TODO Auto-generated method stub

		

		return 0;

	}



	@Override

	public String getAll() {

		// TODO Auto-generated method stub

		return null;

	}



	@Override

	public boolean update(int index, int number) {

		// TODO Auto-generated method stub

		return false;

	}



	@Override

	public int remove() {

		// TODO Auto-generated method stub

		return 0;

	}
}
