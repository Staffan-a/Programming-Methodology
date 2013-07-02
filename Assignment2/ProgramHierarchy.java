/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		drawMiddleLine();
		drawLeftLine();
		drawRightLine();
		
		drawTopBox();
		drawBottomBox();
		drawRightBox();
		drawLeftBox();
		
		topBoxText();
		bottomBoxText();
		leftBoxText();
		rightBoxText();
		
		drawMiddle();
	}
	
	private void drawMiddle()
	{
		double x = (getWidth() - 10)/2;
		double y = (getHeight() - 10)/2;
		
		GOval middle = new GOval(x, y, 10, 10);
		add(middle);
	}
	
	private void drawTopBox() 
	{
		double x = getWidth()/2-BOX_WIDTH/2;
		double y = getHeight()/2-MIDDLE_LINE/2-BOX_HEIGHT;
		
		GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(box);
	}
	
	private void drawBottomBox() 
	{
		double x = (getWidth()/2 - BOX_WIDTH/2);
		double y = getHeight()/2 + MIDDLE_LINE/2;
		
		GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(box);
	}
	
	private void drawRightBox() 
	{
		double x = getWidth()/2+LONG_LINE-BOX_WIDTH/2;
		double y = getHeight()/2 + MIDDLE_LINE/2;
		
		GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(box);
	}
	
	private void drawLeftBox() 
	{
		double x = getWidth()/2-LONG_LINE - BOX_WIDTH/2;
		double y = getHeight()/2 + MIDDLE_LINE/2;
		
		GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
		add(box);
	}
	
	private void topBoxText()
	{
		GLabel topText = new GLabel ("Program");
		
		double x = getWidth()/2 - (topText.getWidth()/2);
		double y = getHeight()/2 + (topText.getAscent()/2) - (MIDDLE_LINE/2) - (BOX_HEIGHT/2);
			
		topText.setLocation(x, y);
		
		add(topText);
	}
	
	private void bottomBoxText()
	{
		GLabel bottomText = new GLabel ("ConsoleProgram");
		
		double x = getWidth()/2 - (bottomText.getWidth()/2);
		double y = getHeight()/2 + (bottomText.getAscent()/2) + (MIDDLE_LINE/2) + (BOX_HEIGHT/2);
			
		bottomText.setLocation(x, y);
		
		add(bottomText);
	}
	
	private void leftBoxText()
	{
		GLabel leftText = new GLabel ("GraphicsProgram");
		
		double x = getWidth()/2 - (leftText.getWidth()/2) - LONG_LINE ;
		double y = getHeight()/2 + (leftText.getAscent()/2) + (MIDDLE_LINE/2) + (BOX_HEIGHT/2);
			
		leftText.setLocation(x, y);
		
		add(leftText);
	}
	
	private void rightBoxText()
	{
		GLabel rightText = new GLabel ("DialogProgram");
		
		double x = getWidth()/2 - (rightText.getWidth()/2) + LONG_LINE;
		double y = getHeight()/2 + (rightText.getAscent()/2) + (MIDDLE_LINE/2) + (BOX_HEIGHT/2);
			
		rightText.setLocation(x, y);
		
		add(rightText);
	}
	
	
	private void drawMiddleLine()
	{
		double x = getWidth()/2;
		double y = getHeight()/2;
		GLine middle = new GLine(x,y+(MIDDLE_LINE/2),x,y-(MIDDLE_LINE/2));
		add(middle);
	}
	
	private void drawRightLine()
	{
		double x = getWidth()/2;
		double y = getHeight()/2;
		GLine right = new GLine(x,y-MIDDLE_LINE/2,x+LONG_LINE,y+MIDDLE_LINE/2);
		add(right);
	}
	
	private void drawLeftLine()
	{
		double x = getWidth()/2;
		double y = getHeight()/2;
		GLine left = new GLine(x,y-MIDDLE_LINE/2,x-LONG_LINE,y+MIDDLE_LINE/2);
		add(left);
	}
	
	private static final int BOX_HEIGHT = 50;
	private static final int BOX_WIDTH = 150;
	private static final int MIDDLE_LINE = 50;
	private static final int LONG_LINE = 180; //Have to be at least half of the BOX_WIDTH constant.
}

