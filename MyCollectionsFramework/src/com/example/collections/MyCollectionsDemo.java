package com.example.collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyCollectionsDemo {

	public static void main(String[] args) {
		/*MyArrayList<String> myarr = new MyArrayList<String>();
		System.out.println(myarr.isEmpty());
		String s1 = new String("One");
		String s2 = new String("Two");
		String s3 = new String("Three");
		String s4 = new String("Four");
		String s5 = new String("Five");
		String s6 = new String("Six");
		myarr.add(s1);
		System.out.println(myarr.isEmpty());
		myarr.add(s2);
		myarr.add(s3);
		myarr.add(s4);
		myarr.add(s5);
		System.out.println(myarr.get(0));
		System.out.println(myarr.get(1));
		System.out.println(myarr.get(2));
		System.out.println(myarr.get(3));
		System.out.println(myarr.get(4));
		System.out.println(myarr.get(5));
		System.out.println(myarr.size());
		myarr.remove("Three");
		System.out.println(myarr.size());
		System.out.println(myarr.get(0));
		System.out.println(myarr.get(1));
		System.out.println(myarr.get(2));
		System.out.println(myarr.get(3));
		System.out.println(myarr.get(4));
		System.out.println(myarr.get(5));
		System.out.println("~~~~~~~~~~~");
		System.out.println(myarr.contains("One"));
		System.out.println(myarr.contains("XXX"));
		myarr.remove("Two");
		System.out.println(myarr.size());
		System.out.println("~~~~~~~~~~~~");
		System.out.println(myarr.get(0));
		System.out.println(myarr.get(1));
		System.out.println(myarr.get(2));
		System.out.println(myarr.get(3));
		System.out.println(myarr.get(4));
		System.out.println(myarr.get(5));
		System.out.println(myarr.size());
		myarr.add(s6);
		System.out.println("~~~~~~~~~~~~``");
		System.out.println(myarr.get(0));
		System.out.println(myarr.get(1));
		System.out.println(myarr.get(2));
		System.out.println(myarr.get(3));
		System.out.println(myarr.get(4));
		System.out.println(myarr.get(5));
		System.out.println("!!!!!!!!!");
		myarr.clear();
		System.out.println(myarr.get(0));
		System.out.println(myarr.get(1));
		System.out.println(myarr.get(2));
		System.out.println(myarr.get(3));
		System.out.println(myarr.get(4));
		System.out.println(myarr.get(5));
		System.out.println(myarr.size());
		MyArrayList<Admin> admins = new MyArrayList<Admin>();
		Admin a1 = new Admin();
		Admin a2 = new Admin();
		admins.add(a1);
		admins.add(a2);
		System.out.println(admins.get(0));
		MyArrayList<User> users = new MyArrayList<User>();
		User u1 = new User();
		User u2 = new User();
		users.add(u1);
		users.add(u2);
		System.out.println(users.get(0));
		LinkedList ll = new LinkedList<>();*/
		MyArrayList<String> myll = new MyArrayList<>();
		/*Admin a1 = new Admin();
		Admin a2 = new Admin();*/
		myll.add("First");
		myll.add("Second");
		System.out.println(myll.size());
		
		for (String string : myll) {
			System.out.println(string);
		}

	}

}
