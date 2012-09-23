package com.aquasheep.GTFTSTG.Items;

import com.aquasheep.GTFTSTG.GTFTSTG;

public class ActionFigure extends Item {

	private static float soundLength = 10f;
	
	public ActionFigure(GTFTSTG game, float leftX, float botY) {
		super(game,"actionFigure",leftX,botY,soundLength);
	}
	
}
