package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class Camera extends Item {

	private static float soundLength = 0.9f;
	
	public Camera(GTFTSTG game, float leftX, float botY) {
		super(game,"camera",leftX,botY,soundLength);
	}
	
}
