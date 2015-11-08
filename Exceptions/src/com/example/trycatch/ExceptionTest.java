package com.example.trycatch;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			Object o = null;
			ExceptionGenereator.nullPointerException(o);
		} catch (Exception e) {
			System.err.println("NullPointer exception was cought");
		}
		
		try {
			ExceptionGenereator.arithmeticalException();
		} catch (Exception e) {
			System.err.println("Arithmetical exception was cought");
		}
		
		try {
			ExceptionGenereator.customException();
		} catch (Exception e) {
			System.err.println("Custom exception was cought");
		} finally {
			System.out.println("EOP");
		}
	}
}
