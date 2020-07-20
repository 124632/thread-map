package com.xworkz.java.Thread.sy;

public class Bounce {
	synchronized static void bookBounceBike() {
		for(int i=0;i<3;i++) {
			System.out.println("Bounce bike is booked by:"+Thread.currentThread().getName());
		}
	}
	static void unlockBounceBike() {
		for(int i=0;i<3;i++) {
		System.out.println("Bounce bike is unlockBounceBike");
		}
	}
	void startRide() {
		for(int i=0;i<3;i++) {
		System.out.println("Bounce bike is startRide");
		}
	}
	void endRide() {
		for(int i=0;i<3;i++) {
		System.out.println("Bounce bike is endRide");
	  }
	}

}
