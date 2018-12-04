package com.sample.dao;

import java.util.ArrayList;

public class UserDAO {

	ArrayList<User> userList;
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
		userList=new ArrayList<User>();
		userList.add(new User("abc", "123", "Admin"));
		userList.add(new User("Roshan", "pass2", "User"));
		userList.add(new User("Prathyusha", "pass3", "Admin"));
		
	}
	
	public String getUserType(String userName, String password){
		
		for(User user:userList){
			if(user.getUserName().equals(userName)&&user.getPassword().equals(password))
				return user.getUserType();
		}
		throw new InvalidUserException("User Name and Password doesn't exist...");
		//return (String) userList.stream().map(user->{if(user.getUserName().equals(userName)&&user.getPassword().equals(password)) return user.getUserType();});
	}
	
}
