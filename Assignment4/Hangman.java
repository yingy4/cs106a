/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 * edit by yy 2016-5-6
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {
	
	private static final int MAX_ALLOWED_GUESSWORD_LENGTH_PER_TIME=1;

    public void run() {
    	String serectWord = null;
    	try {
    		HangmanLexicon hangmanLexicon = new HangmanLexicon();
    		serectWord = hangmanLexicon.getWord(rgen.nextInt(0,hangmanLexicon.getWordCount()));
    	} catch (Exception ex) {
    		println("PLEASE CHECK THE FILE:HangmanLexicon.txt");
    		println(ex.getMessage());
    		println(ex.getStackTrace().toString());
    	}
    	String guessingWord = "";
    	int count = 8;
    	for (int i=0;i<serectWord.length();i++){
    		guessingWord = guessingWord + "-";
    	}
    	println("Welcome to Hangman!");
    	while (!isGameEnd(count,serectWord,guessingWord)) {
    		println("The work now looks like this: "+guessingWord);
    		if (count!=1) {
    			println("You have "+count+" guesses left.");
    		} else {
    			println("You have only one guess left.");
    		}
    		String myGuess = readLine("Your guess:");
    		if (myGuess.length()>MAX_ALLOWED_GUESSWORD_LENGTH_PER_TIME){
    			println("PLEASE ENTER NO MORE THAN "+MAX_ALLOWED_GUESSWORD_LENGTH_PER_TIME+" LETTER PER TIME!");
    			continue;
    		}
    		if (isMyGuessRight(myGuess,serectWord,guessingWord)){
    			guessingWord = changeGuessingWord(myGuess,serectWord,guessingWord);
    			println("That guess is correct.");
    		} else {
    			println("There are no "+myGuess+"'s in the word.");
    			count--;
    		}
    	}
    	if (serectWord.equals(guessingWord)){
    		println("You guessed the word: "+guessingWord);
    		println("You win.");
    	} else {
    		println("You're completely hung.");
    		println("The word was: "+serectWord);
    		println("You lose.");
    	}
	}
    		
    private boolean isGameEnd(int c,String sWord,String gWord){
    	if (sWord.equals(gWord)){
    		return true;
    	}
    	if (c==0){
    		return true;
    	}
    	return false;
    }
    
    private boolean isMyGuessRight(String mGuess,String sWord,String gWord){
    	boolean result = false;
    	for (int i=0;i<sWord.length()+1-mGuess.length();i++){
    		if (mGuess.equalsIgnoreCase(sWord.substring(i, i+mGuess.length()))){
    			result = true;
    			break;
    		}
    	}
    	return result;
    }
    
    private String changeGuessingWord(String mGuess,String sWord,String gWord){
    	for (int i=0;i<sWord.length()+1-mGuess.length();i++){
    		if (mGuess.equalsIgnoreCase(sWord.substring(i, i+mGuess.length()))){
    			gWord = gWord.substring(0, i)+mGuess.toUpperCase()+gWord.substring(i+mGuess.length());
    		}
    	}
    	return gWord;
    }
    		
    private RandomGenerator rgen = RandomGenerator.getInstance();
}