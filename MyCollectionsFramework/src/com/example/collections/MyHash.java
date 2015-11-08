package com.example.collections;

public class MyHash<T> implements IMyCollections<T> {
	Object data[] = new Object[11];
	
	@Override
	public boolean add(T t) {
		data[t.hashCode()] = t;
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T t) {
		for (int i = 0; i < data.length-1; i++) {
			if (data[i].equals(t)) return true;
		}
		return false;
	}

	@Override
	public boolean remove(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int position) {
		return (T) data[position];
	}
	

}
