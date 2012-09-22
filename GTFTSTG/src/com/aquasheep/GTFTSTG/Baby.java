package com.aquasheep.GTFTSTG;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.Action;

public class Baby {
	
	private boolean sleeping = false;
	private int sleepThreshold = 1000;
	public Sound cry,laugh,sleep;
	
	public Baby() {
		cry = Gdx.audio.newSound(Gdx.files.internal("sounds/cry.ogg"));
		laugh = Gdx.audio.newSound(Gdx.files.internal("sounds/laugh.ogg"));
		sleep = Gdx.audio.newSound(Gdx.files.internal("sounds/sleep.ogg"));
		cry.loop();
	}
	
	public boolean attemptSleep(int amount) {
		if (Math.random()*sleepThreshold+amount > sleepThreshold) {
			sleeping = true;
			sleep.loop();
		}
		else {
			sleeping = false;
			sleep.stop();
			cry.loop();
		}
		return sleeping;
	}
	
	public void update(float delta) {
		if (sleeping) {
			if (delta!=0)
				if ((Math.random()*100*(1/delta))>(99*1/delta)) {
					sleeping = false;
					sleep.stop();
					cry.loop();
				}
		}
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
}