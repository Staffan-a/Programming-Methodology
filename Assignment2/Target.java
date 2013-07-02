/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		redCircleLarge();
		whiteCircle();
		redCircleSmall();
	}
	
	private void redCircleLarge(){
		double x = (getWidth() - RADIUS)/2;
		double y = (getHeight() - RADIUS)/2;
		GOval redLarge = new GOval(x,y, RADIUS, RADIUS);
		redLarge.setFilled(true);
		redLarge.setColor(Color.RED);
		add(redLarge);
	}
	
	private void redCircleSmall(){
		double x = (getWidth() - RADIUS*0.3)/2;
		double y = (getHeight() - RADIUS*0.3)/2;
		GOval redSmall = new GOval(x,y, (RADIUS*0.3), (RADIUS*0.3));
		redSmall.setFilled(true);
		redSmall.setColor(Color.RED);
		add(redSmall);
	}
	
	private void whiteCircle(){
		double x = (getWidth() - RADIUS*0.65)/2;
		double y = (getHeight() - RADIUS*0.65)/2;
		GOval white = new GOval(x,y, (RADIUS*0.65), (RADIUS*0.65));
		white.setFilled(true);
		white.setColor(Color.WHITE);
		add(white);
	}
	
	private static final double RADIUS = 272;
}
