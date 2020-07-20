package com.xworkz.java.Thread.interrupt;

public class InterruptMethodDemo {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.interrupt();
	}

}
