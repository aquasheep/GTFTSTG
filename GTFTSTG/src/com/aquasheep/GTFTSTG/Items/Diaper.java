package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Diaper extends Item {
	
	private static float soundLength = 7f;
	
	public Diaper(GTFTSTG game, float leftX, float botY) {
		super(game,"diaper",leftX,botY,soundLength);
	}
	
}
