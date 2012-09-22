package com.aquasheep.GTFTSTG;

import com.aquasheep.GTFTSTG.Items.Bottle;
import com.aquasheep.GTFTSTG.Items.Item;
import com.aquasheep.GTFTSTG.Screens.SplashScreen;
import com.badlogic.gdx.Game;

public class GTFTSTG extends Game {
	
	public static final String LOG = "GTFTSTG Log";
	public final boolean DEBUG = true;
	public Item[] items;
	private Baby baby;
	private int screenWidth, screenHeight;
	
	
	@Override
	public void create() {
		baby = new Baby();
		//Add all items to screen
		items = new Item[1];
		items[0] = new Bottle(this,100,100,200,200);
		
		setScreen(new SplashScreen(this));
	}

	public Baby getBaby() {
		return baby;
	}

	public void setSize(int width, int height) {
		this.screenWidth = width;
		this.screenHeight = height;
	}
	
	public int getWidth() {
		return screenWidth;
	}
	
	public int getHeight() {
		return screenHeight;
	}

}
