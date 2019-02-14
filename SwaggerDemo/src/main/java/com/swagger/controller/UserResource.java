package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger/user")
public class UserResource {

	@GetMapping("/getuser")
	public User getUser() {
		return new User("Birappa",24);
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return user;
	}
}
