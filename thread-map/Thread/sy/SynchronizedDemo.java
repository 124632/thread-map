package com.xworkz.java.Thread.sy;

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d= new Display();
		MyThread pooja=new MyThread(d,"nehu");
		MyThread sushma=new MyThread(d,"seema");
		pooja.start();
		sushma.start();
	}

}
