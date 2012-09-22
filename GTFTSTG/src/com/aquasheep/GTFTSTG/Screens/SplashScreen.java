package com.aquasheep.GTFTSTG.Screens;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.delay;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;

public class SplashScreen extends AbstractScreen implements InputProcessor {
	
	public SplashScreen(GTFTSTG game) {
		super(game);
		Gdx.input.setInputProcessor(this);
	}
	
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		
		//Clear the stage
		stage.clear();
		
		//In the image atlas, the splash image begins at (0,0) in top-left
		//and ends at 512x301
		// retrieve the splash image's region from the atlas
        AtlasRegion splashRegion = getAtlas("splash").findRegion("splash");
        Drawable splashDrawable = new TextureRegionDrawable(splashRegion);
				
		//Create the splash image Actor and set its size
		Image splashImage = new Image(splashDrawable,Scaling.stretch,Align.bottom | Align.left);
		
		//Set Actor width and height to screen width and height
		splashImage.setWidth(width);
		splashImage.setHeight(height);
		
		//Set splash image color to 100% transparent
		splashImage.getColor().a = 0f;
		
		//Configure the fade-in fade-out effect on splash image
		splashImage.addAction(sequence(fadeIn(0.75f),delay(5f,fadeOut(0.75f)), 
			new Action() {
				public boolean act (float delta) {
					dispose();
					return true; //returning true consumes event
				}
			}));
		
		//Add actors to the stage to be processed
		stage.addActor(splashImage);
	}

	@Override
	public void dispose() {
		super.dispose();
		game.setScreen(new GameScreen(game));		
	}

	@Override
	public boolean keyDown(int keycode) {
		dispose();
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		dispose();
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
