package com.xworkz.java.Thread.interrupt;

public class MyThread extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("MyThread :"+i);
			try {
				Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("My thread got interrupted...");
			}
		}
	}

}
