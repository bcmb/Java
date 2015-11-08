package com.example.pingpong;

public class PingPongGame {
	Object o = new Object();
	volatile int state = 0;
	final static int PONG = 1;
	final static int PING = 0;
	
	public void doPing() throws InterruptedException {
		while (true) {
			synchronized (o) {
				while (state != PONG) {
					o.wait();
				}
				System.out.println("PONG");
				state = PING;
				o.notify();
			}
		}
	}
	
	public void doPong() throws InterruptedException {
		while (true) {
			synchronized (o) {
				while (state != PING) {
					o.wait();
				}
				System.out.println("PING");
			    state = PONG;
				o.notify();
			}
		}
	}
}
