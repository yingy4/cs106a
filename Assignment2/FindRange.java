/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 * edit by yy 2016-05-03
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		int i = readInt("?");
		if (i!=0){
			int max = i;
			int min = i;
			while (true){
				i = readInt("?");
				if (i == 0){
					break;
				}
				if (i>max) {
					max = i;
				}
				if (i<min){
					min = i;
				}
			}
			println("smallest:"+min);
			println("largest:"+max);
		} else {
			println("NO NUMBER ENTERED!!");
		}

		
	}
}

