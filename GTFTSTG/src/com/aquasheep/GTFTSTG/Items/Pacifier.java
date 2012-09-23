package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.Gdx;

public class Pacifier extends Item {

	private static float soundLength = 5.1f;
	
	public Pacifier(GTFTSTG game, float leftX, float botY) {
		super(game,"pacifier",leftX,botY,soundLength);
		sound = Gdx.audio.newSound(Gdx.files.internal("sounds/bottle.ogg"));
	}
	
}
