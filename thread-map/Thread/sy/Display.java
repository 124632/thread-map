package com.xworkz.java.Thread.sy;



public class Display {
	synchronized void wish(String name) {
		for(int i=0;i<3;i++) {
			System.out.println("happy birthday"+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

}
