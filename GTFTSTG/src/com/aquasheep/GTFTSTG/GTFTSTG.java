package com.aquasheep.GTFTSTG;

import com.aquasheep.GTFTSTG.Screens.SplashScreen;
import com.badlogic.gdx.Game;

public class GTFTSTG extends Game {
	public static final String LOG = "GTFTSTG Log";
	
	@Override
	public void create() {		
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
