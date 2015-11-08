package com.example.trycatch;

public class ExceptionGenereator {
	
	public static void nullPointerException(Object o) {
		o.toString();
	}
	
	public static void arithmeticalException() {
		int i = 10/0;
	}
	
	public static void customException() throws CustomException {
		throw new CustomException();
	}
}
