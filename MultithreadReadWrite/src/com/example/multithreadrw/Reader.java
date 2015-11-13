package com.example.multithreadrw;

public class Reader implements Runnable {
	Processor p;
	
	public Reader(Processor p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		while(p.s.length()-1 != p.index) {
			try {
				p.getChar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
