package com.example.collections;

public class MyHashDemo {

	public static void main(String[] args) {
		Person p1 = new Person(1);
		Person p2 = new Person(2);
		Person p3 = new Person(3);
		Person p4 = new Person(4);
		Person p5 = new Person(5);
		Person p6 = new Person(6);
		Person p7 = new Person(7);
		Person p8 = new Person(8);
		Person p9 = new Person(9);
		Person p10 = new Person(10);
		Person p20 = new Person(20);
		MyHash<Person> myh = new MyHash<Person>();
		myh.add(p1);
		myh.add(p2);
		myh.add(p3);
		myh.add(p4);
		myh.add(p5);
		myh.add(p6);
		myh.add(p7);
		myh.add(p8);
		myh.add(p9);
		myh.add(p10);
		System.out.println(myh.get(1));
		myh.get(2);
		myh.get(3);
		myh.get(4);
		myh.get(5);
		myh.get(6);
		myh.get(7);
		myh.get(8);
		myh.get(9);
		myh.get(10);
		System.out.println(myh.contains(p20));
	}
}
