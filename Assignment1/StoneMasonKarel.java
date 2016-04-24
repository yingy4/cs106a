/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 * edit by yy 04-23-2016
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run(){
		while (1==1){
			turnLeft();
			repairColumn();
			turnAround();
			walkToWall();
			turnLeft();
			if (this.frontIsClear()){
				move();
				move();
				move();
				move();
			} else {
				System.out.println("OK!!");
				break;
			}
		}
	}
	
	private void repairColumn(){
		while (1==1) {
			if (this.noBeepersPresent()){
				this.putBeeper();
			}
			if (this.frontIsClear()){
				move();
			} else {
				System.out.println("OK");
				break;
			}
		}
	}

	private void walkToWall(){
		while (this.frontIsClear()){
			move();
		}
	
	}
	
}
