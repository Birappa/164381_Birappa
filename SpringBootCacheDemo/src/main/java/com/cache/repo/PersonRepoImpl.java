package com.cache.repo;

import java.util.concurrent.Delayed;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

import com.cache.model.Person;
@EnableCaching
@Component
public class PersonRepoImpl implements PersonRepo {

	@Cacheable
	@Override
	public Person getDetails(String name) {
		
		return new Person(name,"Any Person");
	}

	public void delay() {
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
