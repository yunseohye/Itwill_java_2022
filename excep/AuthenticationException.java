package com.excep;

public class AuthenticationException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public AuthenticationException(String message) {
		
		super(message);
		//부모클래스에 오버로딩된 생성자
		
	}
	
}
