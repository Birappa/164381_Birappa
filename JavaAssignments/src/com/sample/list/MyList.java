package com.sample.list;

public interface MyList {

	boolean add(int number);
	int get(int index);
	String getAll();
	boolean update(int index, int number);
	int remove();
}
