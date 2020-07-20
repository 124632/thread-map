package com.xworkz.java.Thread.block;

public class Chocolate {
	
	static void eat() {
		for(int i=0;i<3;i++) {
			System.out.println("get a chocolate by:"+Thread.currentThread().getName());
		}
		for(int i=0;i<3;i++) {
			System.out.println("open a chocolate by:"+Thread.currentThread().getName());
		}
		for(int i=0;i<3;i++) {
			System.out.println("keep in mouth by:"+Thread.currentThread().getName());
		}
		synchronized (Chocolate.class) {
			for(int i=0;i<3;i++) {
				System.out.println("swallo a chocolate by:"+Thread.currentThread().getName());
			}
		}
		
	}

}
