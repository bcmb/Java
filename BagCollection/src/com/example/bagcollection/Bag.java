package com.example.bagcollection;

public class Bag implements IBag {
	public String[] listOfBags = new String[5];
	private int count = 0;
	
	@Override
	public void add(String s) {
		if(count == listOfBags.length) {
			System.out.println("Alarma!! Bag is full! Extending bag urgently! ...");
			String[] extendedArray = new String[listOfBags.length*2];
			for (int i = 0; i < listOfBags.length; i++) {
				extendedArray[i] = listOfBags[i];
			}
			System.out.println("Array extended. Putting bag which did not fit into a new array.");
			extendedArray[count++] = s;
			listOfBags = extendedArray;
		} else {
			listOfBags[count++] = s;
		}
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}
	
}
