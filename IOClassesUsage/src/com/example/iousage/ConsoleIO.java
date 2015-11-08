package com.example.iousage;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {

	public static void main(String[] args) throws IOException {
		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input first operator:");
		int result = 0;
		String first = breader.readLine();
		String operator = breader.readLine();
		String second = breader.readLine();
		int a = new Integer(first);
		int b = new Integer(second);
		
		switch (operator) {
		case "+":
			System.out.println("= "+(a+b));
			result = (a+b);
			break;
		case "-":
			System.out.println("= "+(a-b));
			result = (a-b);
			break;
		case "/":
			System.out.println("= "+(a/b));
			result = (a/b);
			break;
		case "*":
			System.out.println("= "+(a*b));
			result = (a*b);
			break;
		default:
			break;
		}
		FileOutputStream out = new FileOutputStream("D:/calculations.txt");
		char[] calculationArray = (first+operator+second+"="+result).toCharArray();
		for (char c : calculationArray) {
			out.write(c);
		}
		out.close();
	}
}
