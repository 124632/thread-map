package com.xworkz.java.Thread.Prevantion.sleep;

public class SleepDemo {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("main thread :"+i);	
			try {
				Thread.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
