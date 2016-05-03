/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 * edit by yy 2016-05-03
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
	
		println("Enter values to compute Pythagorean theorem.");
		int a = readInt("a:");
		int b = readInt("b:");
		println("c = "+Math.sqrt(a*a+b*b));
		
	}
}
