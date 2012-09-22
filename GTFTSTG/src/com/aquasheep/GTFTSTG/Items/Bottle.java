package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Bottle extends Item {
	
	public Bottle(GTFTSTG game, float leftX, float botY) {
		super(game, "bottle", leftX, botY);
		sleepChance = 0.5f;
	}

}