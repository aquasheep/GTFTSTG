package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Phone extends Item {

	private static float soundLength = 11.5f;
	
	public Phone(GTFTSTG game, float leftX, float botY) {
		super(game,"phone",leftX,botY,soundLength);
	}
}
