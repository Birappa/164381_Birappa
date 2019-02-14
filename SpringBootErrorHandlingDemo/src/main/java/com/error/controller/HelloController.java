package com.error.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public void sayHello() {
		throw new RuntimeException("Say Hello Exception");
	}
}
