package com.example.collections;

public interface IMyCollections<T> {
	boolean add(T t);
	int size(); 
	boolean isEmpty();
	boolean contains(T t);
	boolean remove(T t);
	void clear();
	T get(int position);
}
