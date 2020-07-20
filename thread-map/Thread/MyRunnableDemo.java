package com.xworkz.java.Thread;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		MyRunnable myRunnable1 = new MyRunnable();

		Thread t1 = new Thread(myRunnable);
		Thread t2 = new Thread(myRunnable);
		
		t1.start();
		t2.start();
		
		 for(int i=0;i<5;i++) {
			   System.out.println("main thread"+i);
		   }

	}

}
