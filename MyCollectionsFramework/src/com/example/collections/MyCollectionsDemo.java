package com.example.collections;

public class MyCollectionsDemo {

	public static void main(String[] args) {

		MyLinkedList<AwesomeNewType> myll = new MyLinkedList<>();
		myll.add(new AwesomeNewType(10));
		myll.add(new AwesomeNewType(30));
		myll.add(new AwesomeNewType(20));
		myll.add(new AwesomeNewType(40));
		//System.out.println(myll.contains(30));
		for (Object object : myll) {
			System.out.println(object);
		}
	}
}
