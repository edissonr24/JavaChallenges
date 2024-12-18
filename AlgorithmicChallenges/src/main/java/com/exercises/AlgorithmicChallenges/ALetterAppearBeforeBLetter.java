package com.exercises.AlgorithmicChallenges;

/**
 * Given string S consisting of N letters 'a' or 'b'. This should return true if all occurrences of 'a' 
 * are before all occurrences of 'b' and return false otherwise.
 * 'b' does not need to occur in S and 'a' does not need to occur in S
 */

public class ALetterAppearBeforeBLetter {
	
	public boolean checkWord(String word) {
		
		if (word.length() == 1)
			return false;
		
		for (int i=0; i<word.length()-1; i++) {
			char letter = word.charAt(i);
			if (letter == 'a') {
				if (word.charAt(i+1) != 'b') {
					return false;
				}
			}
		}
		
		return true;
	}

}
