package com.example.demo;

class Brakets{
	 public void generate(){		 
		synchronized (this) {
		for(int i=1; i<=10; i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5){
				System.out.print("[");
			}else{
				System.out.print("]");
			}
		}
		System.out.println();
		}
		
		for(int j=0; j<=10;j++){
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/* Synchronized method approach
* Time required: 5750
* 
* Synchronized block approach
* Time required: 3950
*/


public class App {

	public static void main(String[] args) {
		Brakets braket = new Brakets();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++){
					braket.generate();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was:"+(endtTime-startTime));
			}
		}).start();
		
      new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++){
					braket.generate();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was:"+(endtTime-startTime));
			}
		}).start();
		

	}

}