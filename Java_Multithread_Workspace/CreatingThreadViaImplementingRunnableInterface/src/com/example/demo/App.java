package com.example.demo;

import java.util.Random;

public class App implements Runnable{
		
	private int threadNo;
	 
	public App(int threadNo) {
		this.threadNo = threadNo;
	}
 
	@Override
	public void run() {
		Random random = new Random();
		for(int i = 0;i<=9;i++){
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	}

