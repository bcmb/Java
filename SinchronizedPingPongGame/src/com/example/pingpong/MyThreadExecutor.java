package com.example.pingpong;

public class MyThreadExecutor {

	public static void main(String[] args) {
		Thread thr = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is another thread");
				
			}});
		System.out.println("main thread");
		thr.start();
		
		PingPongGame pnp = new PingPongGame();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pnp.doPing();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pnp.doPong();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
		}).start();

	}
}
