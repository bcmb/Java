package com.example.collections;

import java.util.LinkedList;

public class MyLinkedList<T> implements IMyCollections<T> {
	
	Node first;
	Node last;
	
	class Node<T> {
		public T data;
		Node prev;
		Node next;
		
		public Node(T data) {
			this.data= data;
		}
	}
	
	private transient Object[] data;
	private int index = 0;
	
	@Override
	public boolean add(T t) {
		if (first == null) {
			Node newNode = new Node(t);
			last = first = newNode;
			newNode.prev = newNode.next = newNode;
			index++;
		} else if (index == 1) {
			Node nextNode = new Node(t);
			nextNode.next = first;
			first.next = nextNode;
			last = nextNode;
			index++;
		} else {
			Node nextNode = new Node(t);
			nextNode.next = first;
			last = nextNode;
			index++;
		}
		return true;
	}

	@Override
	public int size() {
		return index;
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < data.length-1; i++) {
			if (data[i].equals(o))
				return true;
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < data.length-1; i++) {
			if (data[i].equals(o)) {
				//removeFromMiddle(i);
			}
		}
		return false;
	}

	@Override
	public void clear() {
		Object[] tmp = new Object[1];
		data = tmp;
		index = 0;
		
	}

	@Override
	public T get(int position) {
		try {
			return (T)data[position];
		} catch (Exception e) {
			System.out.println("Specified index does not exist in collection");
		}
		return null;
	}
	
	public void showContent(int size) {
		int iterator = 0;
		Node n = first;
		for (int i = 0; i <= size; i++) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}
