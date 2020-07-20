package com.xworkz.java.Thread.name;

public class MyThread extends Thread{
	public void run() {
		Thread.currentThread().setName("core java");
		   for(int i=1;i<5;i++) {
			   System.out.println(Thread.currentThread().getName());
		   }
		}

}
