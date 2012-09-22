package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.math.Vector2;


public class Bottle extends Item {
	
	public Bottle(GTFTSTG game, int x, int y) {
		super(game, "bottle", new Vector2(x,y));
		sleepChance = 0.5f;
	}

}
