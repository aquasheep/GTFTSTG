package com.aquasheep.GTFTSTG;

public class Baby {
	
	private boolean sleeping = false;
	private int sleepThreshold = 1000;
	
	public Baby() {
		
	}
	
	public boolean attemptSleep(int amount) {
		
		if (Math.random()*sleepThreshold+amount > sleepThreshold)
			sleeping = true;
		else
			sleeping = false;
		
		return sleeping;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
}