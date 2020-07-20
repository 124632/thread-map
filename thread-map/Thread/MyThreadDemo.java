package com.xworkz.java.Thread;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt.start();//it register with thread schedular and involkes thread
		//class run method user overriding own run method
		mt1.start();
		mt2.start();
		   for(int i=0;i<5;i++) {
			   System.out.println("main thread"+i);
		   }
	}

}
