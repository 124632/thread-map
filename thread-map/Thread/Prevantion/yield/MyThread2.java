package com.xworkz.java.Thread.Prevantion.yield;

public class MyThread2 extends Thread{
	
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("MyThread2:"+i);
		}
	}

}
