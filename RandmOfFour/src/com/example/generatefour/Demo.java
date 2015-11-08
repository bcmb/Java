package com.example.generatefour;

public class Demo {

	public static void main(String[] args) {
		Admin a = new Admin();
		User u = new User();
		System.out.println(a);
		System.out.println(u);
		System.out.println("~~~~~~~~~");
		User u1 = new Admin(); 
		System.out.println(u1);
		Object o;
		o = u1;
		System.out.println(u1);
		//System.out.println(u1.out);
	}

}
