package com.example.bagcollection;

public class BagTest {

	public static void main(String[] args) {
		Bag bagOfBags = new Bag();
		System.out.println(bagOfBags.size());
		System.out.println(bagOfBags.isEmpty());
		bagOfBags.add("bag1");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		System.out.println(bagOfBags.isEmpty());
		bagOfBags.add("bag2");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag3");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag4");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag5");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag6");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag7");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag8");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag9");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag10");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag11");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag12");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag13");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag14");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag15");
		System.out.print("Current size is:");
		System.out.println(bagOfBags.size());
		bagOfBags.add("bag16");
		System.out.println("~~~~~~~~~LIST OF ALL BAGS~~~~~~~~~~~");
		for (String string : bagOfBags.listOfBags) {
			System.out.println(string);
		}

	}

}
