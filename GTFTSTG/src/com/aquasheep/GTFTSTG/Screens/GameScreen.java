package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.aquasheep.GTFTSTG.Controller.Controller;
import com.aquasheep.GTFTSTG.View.WorldRenderer;
import com.badlogic.gdx.Gdx;

public class GameScreen extends AbstractScreen {
	
	private int counter = 0;
	
	public GameScreen(GTFTSTG game) {
		super(game);
		//Add all items to stage
		for (int i = 0; i < game.items.length; ++i) {
			stage.addActor(game.items[i]);
		}
		//Create controller and set as input processor
		Gdx.input.setInputProcessor(new Controller(game));
		//Make new renderer
	}
	
	@Override
	public void render(float delta) {
		++counter;
		if (game.DEBUG) {
			if (counter%((int)(1/delta))==0) {
				//game.items[0].activate();
				counter=0;
			}
		}
		super.render(delta);
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	
}
