package com.example.demo;

public class App {
	public int counter = 0;

	public static void main(String[] args) {
		App app = new App();

		Thread thread1 = new Thread(new Runnable() {
         
			@Override
			public void run() {
			
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					thread1.join(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}

			}
		});
		thread1.start();
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The value of counter: " + app.counter);
	}

}