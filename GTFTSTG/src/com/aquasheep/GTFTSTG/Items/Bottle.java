package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.math.Rectangle;

public class Bottle extends Item {
	
	public Bottle(GTFTSTG game, float leftX, float botY, float width, float height) {
		super(game, "bottle", new Rectangle(leftX,botY, width, height));
		sleepChance = 0.5f;
	}

}
