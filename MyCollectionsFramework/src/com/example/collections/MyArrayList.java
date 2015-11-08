package com.example.collections;

import java.util.Iterator;

public class MyArrayList<T> implements IMyCollections<T>, Iterable<T> {
	private transient Object[] data;
	private int index = 0;
	public MyArrayList() {
		this.data = new Object[10];
	}
	
	@Override
	public boolean add(T t) {
			data[index] = t;
			increaseDataSize();
			index++;
		return true;
	}

	private void increaseDataSize() {
		long t = System.currentTimeMillis();
		Object[] tmp = new Object[data.length+1];
		System.out.println(t - System.currentTimeMillis());
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
		for (int i = 0; i < data.length; i++) { // 1 < 1 => 0
			if (data[i].equals(o))
				return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < data.length - 1; i++) {
			if (data[i].equals(o)) {
				removeFromMiddle(i);
			}
		}
		return false;
	}

	@Override
	public void clear() {
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
	
	private void removeFromMiddle(int i) { // 0 shift existing array
		int k = 0;
		Object[] tmp = new Object[data.length-1];
		for (int j = 0; j < data.length; j++, k++) {
			if (j == i) j++;
			tmp[k] = data[j];
		}
		data = tmp;
		index = k-1;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index = 0;
			
			@Override
			public boolean hasNext() {
				return index != size();
			}

			@Override
			public T next() {
				return (T) data[index++];
		
			}
		};

	}
}
