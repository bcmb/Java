package com.example.multithreadrw;

public class Executor {
	char ch;
	int iterator = 0;
	String s = "String";
	boolean isReadyToOut = false;
	synchronized void getChar() throws InterruptedException {
			while (!isReadyToOut) {
				wait();
			}
				while (iterator <= s.length()-1) {
				ch = s.charAt(iterator);
				iterator++;
				isReadyToOut = true;
				notify();
				}
			}
	
	synchronized void displayChar() throws InterruptedException {
		while (isReadyToOut) {
			wait();
		}
		System.out.println(ch);
		notify();
	}
}
