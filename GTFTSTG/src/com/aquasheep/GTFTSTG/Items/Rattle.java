package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Rattle extends Item {

	private static float soundLength = 5.5f;
	
	public Rattle(GTFTSTG game, float leftX, float botY) {
		super(game,"rattle",leftX,botY,soundLength);
	}
	
}
