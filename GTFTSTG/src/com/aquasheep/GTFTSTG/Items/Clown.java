package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Clown extends Item {

	private static float soundLength = 2.35f;
	
	public Clown(GTFTSTG game, float leftX, float botY) {
		super(game,"clown",leftX,botY,soundLength);
	}
	
}
