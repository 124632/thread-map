package com.xworkz.java.Thread.Prevantion.yield;

public class YieldMethodDemo {
	public static void main(String[] args) {
		MyThread1 myThread1= new MyThread1();
		MyThread2 myThread2= new MyThread2();
		myThread1.start();
		myThread2.start();
	}

}
