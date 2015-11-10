package com.example.multithreadrw;

public class Runner implements Runnable {
	
	@Override
	public void run() {
		Executor ex = new Executor();
		while (true) {
			try {
				ex.getChar();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			try {
				ex.displayChar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
