package com.aquasheep.GTFTSTG;

import com.aquasheep.GTFTSTG.Screens.SplashScreen;
import com.badlogic.gdx.Game;

public class GTFTSTG extends Game {
	
	public static final String LOG = "GTFTSTG Log";
	public Item[] items;
	
	@Override
	public void create() {		
		setScreen(new SplashScreen(this));
	}

}
