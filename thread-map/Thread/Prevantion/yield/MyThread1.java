package com.xworkz.java.Thread.Prevantion.yield;

public class MyThread1  extends Thread{
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("MyThread1:"+i);
			Thread.yield();
		}
	}

}
