package com.example.multithreadrw;

import com.example.multithreadrw.*;

public class MultithreadRWDemo {

	public static void main(String[] args) {
		String s = "This is a simple string";
		Runner r = new Runner();
		Thread t = new Thread(r);
		t.start();
	}
}
