package com.xworkz.java.Thread.Prevantion.join;

public class MyThread extends Thread{
	static Thread mainThread;
	public void run() {
		try {
			mainThread.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0;i<3;i++) {
			System.out.println("MyThread:"+i);
		}
	}
}
