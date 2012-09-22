package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends AbstractScreen {
	
	public GameScreen(GTFTSTG game) {
		super(game);
	}
	
	@Override
	public void render(float delta) {
		if (game.DEBUG) {
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			Gdx.gl.glClearColor(200,30,150,255);
			
			game.items[0].activate();
		}
	}
	
}
