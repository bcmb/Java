package com.example.multithreadrw;

public class Writer implements Runnable {
	Processor p;
		
	public Writer(Processor p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		while(p.s.length() != p.index) {
			try {
				p.putChar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	System.out.println("Copying done the result is "+p.result);
	}
}
