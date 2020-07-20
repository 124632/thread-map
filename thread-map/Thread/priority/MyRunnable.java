package com.xworkz.java.Thread.priority;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("adv-java");
		System.out.println(Thread.currentThread()
				.getPriority()+"-"+Thread.currentThread().getName());
		   for(int i=1;i<5;i++) {
			   System.out.println(Thread.currentThread().getName()+":"+i);
		   }
	}

}
