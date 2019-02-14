package com.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cache.repo.PersonRepoImpl;

@SpringBootApplication
public class SpringBootCacheDemoApplication implements CommandLineRunner {

	private Logger logger=LoggerFactory.getLogger(SpringBootCacheDemoApplication.class);
	
	@Autowired
	private PersonRepoImpl personRepoImpl;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		logger.info(personRepoImpl.getDetails("birappa").toString());
		personRepoImpl.delay();
		logger.info(personRepoImpl.getDetails("birappa").toString());
		personRepoImpl.delay();
		logger.info(personRepoImpl.getDetails("patil").toString());
		personRepoImpl.delay();
		logger.info(personRepoImpl.getDetails("birpatil").toString());
	}

}

