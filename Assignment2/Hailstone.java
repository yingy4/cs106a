/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 * edit by yy 2016-05-03
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		int i = readInt("Enter a number:");
		int temp;
		int count = 0;
		if (i>0){
			while (i!=1){
				if (isOdd(i)){
					temp = 3*i + 1;
					println(i+" is odd, so I make 3n+1: "+temp);
					i = temp;
				} else {
					temp = i/2;
					println(i+" is even, so I take half: "+temp);
					i = temp;
				}
				count++;
			}
			println("The process took "+count+" to reach 1");
		} else {
			println("PLEASE ENTER POSITIVE INTEGER!");
		}
	}
	
	private boolean isOdd(int orig){
		if (orig % 2 == 0){
			return false;
		} else {
			return true;
		}
	}
	
}

