package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen extends AbstractScreen {
	
	private int counter = 0;
	
	public GameScreen(GTFTSTG game) {
		super(game);
		//Add all items to stage
		for (int i = 0; i < game.items.length; ++i) {
			stage.addActor(game.items[i]);
		}
	}
	
	@Override
	public void render(float delta) {
		++counter;
		if (game.DEBUG) {
			if (counter%((int)(1/delta))==0)
				game.items[0].activate();
		}
		super.render(delta);
	}
	
}
