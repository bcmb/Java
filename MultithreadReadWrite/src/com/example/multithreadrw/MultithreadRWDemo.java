package com.example.multithreadrw;

public class MultithreadRWDemo {

	public static void main(String[] args) {
		Processor processor = new Processor("Hello world");
		new Thread(new Reader(processor)).start();
		new Thread(new Writer(processor)).start();
	}
}
