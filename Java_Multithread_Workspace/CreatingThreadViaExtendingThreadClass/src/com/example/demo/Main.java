package com.example.demo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreatingThreadViaExtendingThreadClass counter1 = new CreatingThreadViaExtendingThreadClass(1);
		CreatingThreadViaExtendingThreadClass counter2 = new CreatingThreadViaExtendingThreadClass(2);
		
	    long startTime = System.currentTimeMillis();
		counter1.run(); //Run should be called by JVM
		System.out.println("**************************");
		counter2.run(); //Run should be called by JVM
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTime-startTime));
		
		
		CreatingThreadViaExtendingThreadClass counter3 = new CreatingThreadViaExtendingThreadClass(3);
		CreatingThreadViaExtendingThreadClass counter4 = new CreatingThreadViaExtendingThreadClass(4);
		long startTimeVal = System.currentTimeMillis();
		counter3.start(); //Run should be called by JVM
		System.out.println("**************************");
		counter4.start(); //Run should be called by JVM
		Thread.sleep(4505);
		long endTimeVal = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTimeVal-startTimeVal));
	}

}
