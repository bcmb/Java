package com.example.collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyCollectionsDemo {

	public static void main(String[] args) {

		MyLinkedList<String> myll = new MyLinkedList<>();
		myll.add("One");
		myll.add("Two");
		myll.add("Three");
		myll.add("Four");
		myll.showContent(myll.size());
	}

}
