package com.xworkz.java.Thread.sy;

public class ClassLevelLockDemo {
	public static void main(String[] args) {
		Bounce bounce=new Bounce();
		
		BounceThread bounceThread1=new BounceThread(bounce);
		BounceThread bounceThread2=new BounceThread(bounce);
		bounceThread1.setName("suma");
		bounceThread2.setName("pooja");
		
		bounceThread1.start();
		bounceThread2.start();
	}

}
