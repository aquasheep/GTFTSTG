package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.aquasheep.GTFTSTG.Controller.Controller;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class GameScreen extends AbstractScreen {
	
	private Texture background;
	private Sound sirens;
	private Sound helicopter;
	private Sound carAlarm;
	private double randomEventCounter;
	
	public GameScreen(GTFTSTG game) {
		super(game);
		//Add all items to stage
		for (int i = 0; i < game.items.length; ++i) {
			stage.addActor(game.items[i]);
		}
		//Create controller and set as input processor
		Gdx.input.setInputProcessor(new Controller(game));
		background = new Texture("images/BabyRoom.png");
		game.backgroundSound = Gdx.audio.newSound(Gdx.files.internal("sounds/background.ogg"));
		game.backgroundSound.loop(0.5f);
		sirens = Gdx.audio.newSound(Gdx.files.internal("sounds/police.ogg"));
		helicopter = Gdx.audio.newSound(Gdx.files.internal("sounds/helicopter.ogg"));
		carAlarm = Gdx.audio.newSound(Gdx.files.internal("sounds/carAlarm.ogg"));
	}
	
	@Override
	public void render(float delta) {
		randomEventCounter = Math.random()*100000;
		if (randomEventCounter>99990) {
			sirens.play();
		}
		
		if (randomEventCounter>20 && randomEventCounter<30) {
			helicopter.play();
		}
		
		if (randomEventCounter<10) {
			carAlarm.play();
		}
			
		//Draw background
		batch.begin();
		//Compensate for bottom of background being transparent
		batch.draw(background,0,-(1024-768));
		batch.end();
		//Draw everything else
		stage.act(delta);
		stage.draw();
		game.getBaby().update(delta);
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		//TODO reposition items based on size changes
		game.setSize(width,height);
	}
	
}
