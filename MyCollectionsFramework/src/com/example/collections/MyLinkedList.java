package com.example.collections;

public class MyLinkedList<T> implements IMyCollections<T> {

	class Node<T> {
		int prev;
		int next;
		public T data;
	
		public Node (int prev, int next, T data) {
			this.prev = prev; 
			this.next = next; 
			this.data = data; 
		}
	}
	
	private transient Object[] data;
	private int index = 0;
	
	public MyLinkedList() {
		this.data = new Object[1];
	}
	
	@Override
	public boolean add(T t) {
		if (index == 0) {
			data[index] = new Node(t.hashCode(), t.hashCode(), t);;
			index++;
			return true;
			
		} else {
			increaseDataSize(); 
			data[index] = new Node(((Node) data[index-1]).next, ((Node) data[0]).prev, t);
			index++;
			return true;
		}
	}

	private void increaseDataSize() {
		Object[] tmp = new Object[data.length+1];
		for (int i = 0; i < data.length; i++) {
			tmp[i] = data[i];
		}
		data = tmp;
	}

	@Override
	public int size() {
		return data.length;
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
				removeFromMiddle(i);
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
	
	private void removeFromMiddle(int i) {
		int k = 0;
		Object[] tmp = new Object[data.length-1];
		for (int j = 0; j < data.length; j++, k++) {
			if (j == i) j++;
			tmp[k] = data[j];
		}
		data = tmp;
		index = k-1;
	}

}
