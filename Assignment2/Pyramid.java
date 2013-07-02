/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		drawManyBricks();
	}
	
	private void drawManyBricks()
	{
		int totalLenght = BRICKS_IN_BASE * BRICK_WIDTH;
		int startPos = (getWidth()-totalLenght)/2 - BRICK_WIDTH;
		
		for(int newLevel = 1; newLevel <= BRICKS_IN_BASE; newLevel++)
		{
			//double startPosNew = getHeight() - BRICK_HEIGHT
			
			for (int startBricks = BRICKS_IN_BASE; startBricks > 0; startBricks--)
			{
				double startPosX = startPos + (startBricks*BRICK_WIDTH);
				double startPosY = getHeight() - BRICK_HEIGHT * newLevel;
			
				drawBrick(startPosX, startPosY);
			}
		}
		
	}
	
	private void drawBrick(double x, double y) 
	{		
		GRect brick = new GRect(x,y, BRICK_WIDTH, BRICK_HEIGHT);
		add(brick);
	}
		
}
