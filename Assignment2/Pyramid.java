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
 * edit by yy 2016-05-03
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
		//every loop print a line of bricks
		for (int i=BRICKS_IN_BASE;i>=0;i--){
			//every loop print a brick in a line
			for (int j=i;j>=0;j--){
				this.add(new GRect(BRICK_WIDTH,BRICK_HEIGHT),(this.getWidth()-i*BRICK_WIDTH)/2+j*BRICK_WIDTH,this.getHeight()-(BRICKS_IN_BASE-i)*BRICK_HEIGHT);
			}
		}
	}
}

