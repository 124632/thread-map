package com.xworkz.java.Thread.Prevantion.join;

public class JoinMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread.mainThread=Thread.currentThread();
		MyThread myThread = new MyThread();
		myThread.start();
		//myThread.join(); ---> it use first mythread next mainthread 
		//Thread.currentThread().join();  --->it is use deadlock
		for(int i=0;i<3;i++) {
		System.out.println("main thread :"+i);	
		}
	}

}
