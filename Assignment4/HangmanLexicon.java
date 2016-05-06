/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 * edit by yy 2016-5-6
 */

import acm.util.*;
import java.io.*;
import java.util.*;

public class HangmanLexicon {
	
	private ArrayList<String> arr = new ArrayList<String>();
	
	public HangmanLexicon() throws Exception{
		try {
			BufferedReader br = new BufferedReader(new FileReader("HangmanLexicon.txt"));
			while (br.readLine()!=null){
				arr.add(br.readLine());
			}
		} catch (Exception ex) {
			throw ex;
		}
		
		
	}
	

/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return arr.size();
	}

/** Returns the word at the specified index. */
	public String getWord(int index) {
		return arr.get(index);
	};
}
