package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.aquasheep.GTFTSTG.Controller.Controller;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class GameScreen extends AbstractScreen {
	
	private int counter = 0;
	private Texture background;
	
	public GameScreen(GTFTSTG game) {
		super(game);
		//Add all items to stage
		for (int i = 0; i < game.items.length; ++i) {
			stage.addActor(game.items[i]);
		}
		//Create controller and set as input processor
		Gdx.input.setInputProcessor(new Controller(game));
		background = new Texture("images/BabyRoom.png");
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
		//Draw background
		batch.begin();
		//Compensate for bottom of background being transparent
		batch.draw(background,0,-(1024-768));
		batch.end();
		//Draw everything else
		stage.act(delta);
		stage.draw();
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		//TODO reposition items based on size changes
		game.setSize(width,height);
	}
	
}
