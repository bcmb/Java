package com.example.collections;

public class Person {
	private int id;
	Person (int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public String toString() {
		return id+"";
	}
	@Override
	public boolean equals(Object obj) {
		if (id == ((Person) obj).id) return true;
		return false;
	}
}
