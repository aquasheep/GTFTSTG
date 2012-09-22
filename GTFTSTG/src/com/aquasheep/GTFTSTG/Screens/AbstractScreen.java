package com.aquasheep.GTFTSTG.Screens;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;


public abstract class AbstractScreen implements Screen {

	protected GTFTSTG game;
	protected FPSLogger FPSLog;
	protected TextureAtlas atlas;
	protected final Stage stage;
	protected final SpriteBatch batch;
	
	public AbstractScreen(GTFTSTG game) {
		this.game = game;
		stage = new Stage(0,0,true);
		batch = new SpriteBatch();
		FPSLog = new FPSLogger();
	}
	
	/** Returns the class name of the calling screen */
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	public TextureAtlas getAtlas(String name) {
		if (atlas==null) {
			atlas = new TextureAtlas(Gdx.files.internal("image-atlases/"+name+".pack"));
		}
		return atlas;
	}
	
	//Screen implementation
	@Override
	public void show() {
		Gdx.app.log(GTFTSTG.LOG,"Showing screen "+getName());
	}
	
	@Override
	public void render(float delta) {
		FPSLog.log();
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//Update stage and actors
		stage.act(delta);
		stage.draw();
	}
	
	@Override
	public void resize(int width, int height) {
		Gdx.app.log(GTFTSTG.LOG,"Resizing screen "+getName()+" to "+width+","+height);
		
		//Resize the stage
		stage.setViewport(width, height, true);
		game.setSize(width,height);
	}

	@Override
	public void hide() {
		Gdx.app.log(GTFTSTG.LOG,"Hiding screen "+getName());
	}

	@Override
	public void pause() {
		Gdx.app.log(GTFTSTG.LOG,"Pausing screen "+getName());
	}

	@Override
	public void resume() {
		Gdx.app.log(GTFTSTG.LOG,"Resuming screen "+getName());
	}

	@Override
	public void dispose() {
		Gdx.app.log(GTFTSTG.LOG,"Disposing screen "+getName());
		
		batch.dispose();
		stage.dispose();
	}
}
