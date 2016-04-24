/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 * edit by yy 04-23-2016
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
		this.putBeeper();
		turnLeft();
		drawALine();
		turnAround();
		walkToWall();
		turnLeft();
		while (this.frontIsClear()){
			if (this.beepersPresent()){
				move();
			} else {
				move();
				this.putBeeper();
			}
			turnLeft();
			drawALine();
			turnAround();
			walkToWall();
			turnLeft();
		}
		
	}
	
	private void drawALine(){
		while (this.frontIsClear()){
			if (this.beepersPresent()){
				move();
			} else {
				move();
				this.putBeeper();
			}
		}
	}
	
	private void walkToWall(){
		while (this.frontIsClear()){
			move();
		}
	
	}

}
