package com.xworkz.java.Thread.sy;

public class BounceThread extends Thread{
	 Bounce bounce;
	 
	 public BounceThread(Bounce bounce) {
		 this.bounce=bounce;
		 
	 }
	 @Override
	public void run() {
		bounce.bookBounceBike();
		bounce.unlockBounceBike();
		bounce.startRide();
		bounce.endRide();
	}

}
