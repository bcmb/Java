package com.example.multithreadrw;

public class Processor {
	String s;
	String result ="";
	char temp;
	int index = 0;
	boolean isReadable = true;
	
	public Processor(String s) {
		this.s = s; 
	}
	
	synchronized void getChar() throws InterruptedException {
		while(!isReadable) 
		wait();
		temp = s.charAt(index);
		System.out.println("char at position "+index+" read");
		isReadable = false;
		notify();
	}
	
	synchronized void putChar() throws InterruptedException {
		while(isReadable) 
		wait();
		result += temp;
		System.out.println("char at position "+index+" put");
		index++;
		isReadable = true;
		notify();
	}
}
