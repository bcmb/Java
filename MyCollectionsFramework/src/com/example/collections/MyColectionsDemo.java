package com.example.collections;

import java.util.ArrayList;

public class MyColectionsDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		ArrayList<Integer> arraylist2 = new ArrayList<>(arraylist);
		for (Integer integer : arraylist2) {
			System.out.println(integer);
		}
	}
}
