package com.xworkz.java.Thread.priority;

public class ThreadPriorityDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(2);
		Thread.currentThread().setName("Xworkz");
		System.out.println(Thread.currentThread()
				.getPriority()+"-"+Thread.currentThread().getName());
		
		MyRunnable myRunnable = new MyRunnable();
		Thread childThread = new Thread(myRunnable);
		childThread.setPriority(8);
		childThread.start();
		
		for(int i=1;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
