package com.error.controller;

public class ErrorResponse {

	private int code;
	private String errorMessage;
	public ErrorResponse(int code, String errorMessage) {
		super();
		this.code = code;
		this.errorMessage = errorMessage;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
