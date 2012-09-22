package com.aquasheep.GTFTSTG.View;

import com.aquasheep.GTFTSTG.GTFTSTG;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/** Renders items onto screen */
public class WorldRenderer {

	private GTFTSTG game;
	private SpriteBatch batch;
	private ShapeRenderer debugRenderer;
	
	public WorldRenderer(GTFTSTG game, SpriteBatch batch) {
		this.game = game;
		this.batch = batch;
		this.debugRenderer = new ShapeRenderer();
	}
	
	public void render(float delta) {
		
	}
	
	public void debugRender(float delta) {
		debugRenderer.begin(ShapeRenderer.ShapeType.Rectangle);
		for (int i = 0; i < game.items.length; ++i) {
			debugRenderer.rect(game.items[0].getPos().x, game.items[0].getPos().y, game.items[0].getPos().width, game.items[0].getPos().height);
		}
		debugRenderer.end();
	}
	
}