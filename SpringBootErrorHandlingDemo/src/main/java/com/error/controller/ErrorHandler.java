package com.error.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> errorHandling(Exception e){
		ErrorResponse errorResponse=new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
