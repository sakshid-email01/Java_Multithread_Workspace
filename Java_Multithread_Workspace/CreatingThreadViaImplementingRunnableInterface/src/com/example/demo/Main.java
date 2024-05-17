package com.example.demo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new App(1));
		Thread thread2 = new Thread(new App(2));

		thread1.start();
		thread2.start();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					;
					System.out.println(i);
				}

			}
		});
		thread.start();

	}
}
