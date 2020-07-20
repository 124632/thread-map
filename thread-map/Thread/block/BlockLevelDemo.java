package com.xworkz.java.Thread.block;

public class BlockLevelDemo {
	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		
		ChocolateThread chocolateThread1=new ChocolateThread(chocolate);
		ChocolateThread chocolateThread2=new ChocolateThread(chocolate);
		
		chocolateThread1.setName("Arti");
		chocolateThread2.setName("Sushma");
		
		chocolateThread1.start();
		chocolateThread2.start();
	}

}
