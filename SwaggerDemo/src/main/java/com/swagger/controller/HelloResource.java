package com.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/swagger")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class HelloResource {

	@ApiOperation(value = "Returns Hello World")
	@GetMapping("/get")
	public String helloGet() {
		return "Hello World";
	}
	
	@ApiOperation(value = "Returns Hello World")
	@PostMapping("/post")
	public String helloPost() {
		return "Hello World";
	}
	
	@ApiOperation(value = "Returns Hello World")
	@PutMapping("/put")
	public String helloPut() {
		return "Hello World";
	}
}
