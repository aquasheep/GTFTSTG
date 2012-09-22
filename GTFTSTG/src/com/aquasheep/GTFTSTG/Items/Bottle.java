package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Bottle extends Item {
	
	private static float soundLength = 5f;
	
	public Bottle(GTFTSTG game, float leftX, float botY) {
		super(game, "bottle", leftX, botY, soundLength);
		sleepChance = 0.1f;
	}

}