package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;

/** Items are anything on the screen that can be clicked to produce a certain effect. */
public abstract class Item extends Actor {

	protected final GTFTSTG game;
	protected final String name;
	protected Rectangle pos;
	protected final Action event;
	protected float sleepChance;
	
	/**
	 * Creates a new Item.
	 * @param game - the game the item is being used in
	 * @param name - the name of the item (used to find its texture in the "items.pack" image atlas)
	 * @param pos  - position to initially draw the item
	 * @param event - scene2d.Action to fulfill when item is clicked 
	 */
	public Item(GTFTSTG theGame, String theName, Rectangle pos) {
		this.game = theGame;
		this.name = theName;
		this.pos = pos;
		//TODO make collision rectangle (pos) based on image size
		event = new Action() {
			@Override
			public boolean act(float delta) {
				// TODO Finish action
				if (game.DEBUG) {
					System.out.println(name+" has been activated.");
					System.out.println("Baby sleeping: "+game.getBaby().attemptSleep((int)(sleepChance*1000)));
				}
				//playsound(name)
				//game.baby.attemptSleep(sleepChance)
				return true;
			}
		};
	}
	
	/** Activates particular event associated with the Item. Called when an item is clicked*/
	public void activate() {
		this.addAction(event);
	}

	public boolean selected(float mouseX, float mouseY) {
		if (pos.contains(mouseX,mouseY)) {
			return true;
		}
		return false;
	}
}