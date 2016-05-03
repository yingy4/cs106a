/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 * edit by yy 2016-05-03
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	
	private static final int INCH = 72;
	private static final double INCH065 = 72*0.65;
	private static final double INCH030 = 72*0.3;
	
	public void run() {
		//the one inch circle and color is red
		GOval g1=new GOval(this.getWidth()/2-INCH,this.getHeight()/2-INCH,INCH*2,INCH*2);
		g1.setFilled(true);
		g1.setColor(Color.RED);
		//the 0.65 inch circle and color is white
		GOval g2=new GOval(this.getWidth()/2-INCH065,this.getHeight()/2-INCH065,INCH065*2,INCH065*2);
		g2.setFilled(true);
		g2.setColor(Color.WHITE);
		//the 0.3 inch circle and color is red
		GOval g3=new GOval(this.getWidth()/2-INCH030,this.getHeight()/2-INCH030,INCH030*2,INCH030*2);
		g3.setFilled(true);
		g3.setColor(Color.RED);
		this.add(g1);
		this.add(g2);
		this.add(g3);
		
	}
}
