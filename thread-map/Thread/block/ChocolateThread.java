package com.xworkz.java.Thread.block;

public class ChocolateThread extends Thread{
	Chocolate  chocolate;
	
	public ChocolateThread(Chocolate chocolate) {
		this.chocolate = chocolate;
	}

	public void run() {
		// TODO Auto-generated method stub
		chocolate.eat();
		
	}

}
