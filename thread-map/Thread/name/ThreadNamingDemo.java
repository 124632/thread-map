package com.xworkz.java.Thread.name;

public class ThreadNamingDemo {
	public static void main(String[] args) {
		Thread.currentThread().setName("Xworkz");
		MyThread myThread = new MyThread();
		myThread.start();
		
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
