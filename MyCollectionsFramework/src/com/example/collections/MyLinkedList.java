package com.example.collections;

import java.util.Iterator;

public class MyLinkedList<T> implements IMyCollections<T>, Iterable {
	private int index = 0;
	private Object[] arrayOfLinks; 
		
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
	
	@Override
	public boolean add(T t) {
		if (first == null) {
			Node newNode = new Node(t);
			last = first = newNode;
			index++;
		} else if (index == 1) {
			Node nextNode = new Node(t);
			nextNode.prev = first;
			first.next = nextNode;
			last = nextNode;
			index++;
		} else {
			Node nextNode = new Node(t);
			last.next = nextNode;
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
	public boolean contains(T o) {
		Node n = first;
		for (int i = 0; i <= index-1; i++) {
			if (o.equals(n.data)) return true;
			n = n.next;
		}
		return false;
	} 

	@Override
	public void clear() {
		first = last = null; 
	}

	@Override
	public T get(int position) {
		return null;
	}
	
	private void createArrayOfLinks() {
		Node n = first;
		arrayOfLinks = new Object[index];
		for (int i = 0; i <= index-1; i++) {
			arrayOfLinks[i] = n;
			n = n.next;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int in = 0;
			Node n = null;
			@Override
			public boolean hasNext() {
				return in != index;
			}

			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public T next() {
				createArrayOfLinks();
				n = (Node) arrayOfLinks[in++];
				return (T)n.data;
			}
		};
	}

	@Override
	public boolean remove(T t) {
		return false;
	}
}
