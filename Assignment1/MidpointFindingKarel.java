/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 * edit by yy 04-24-2016
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run(){

		while (1==1) {
			if (this.noBeepersPresent()){
				this.putBeeper();
			} else {
				this.putBeeper();
				break;
			}
			this.walkToBeeperOrWall();
			this.turnAround();
		}
		this.walkToWall();
		this.turnAround();
		this.pickBeeper();
		while (this.frontIsClear()){
			move();
			this.pickBeeper();
		}
		this.turnAround();
		while (this.noBeepersPresent()){
			move();
		}
	}
	
	private void walkToWall(){
		while (this.frontIsClear()){
			move();
		}
	}
	
	private void walkToBeeperOrWall(){
		while (1==1){
			if (this.frontIsClear()){
				move();
				if (this.beepersPresent()){
					this.turnAround();
					move();
					this.turnAround();
					break;
				}
			} else {
				break;
			}
			
		}
	}

}
