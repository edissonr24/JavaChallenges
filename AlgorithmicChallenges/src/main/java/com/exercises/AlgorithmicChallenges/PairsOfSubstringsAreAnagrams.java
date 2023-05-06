package com.exercises.AlgorithmicChallenges;

import java.util.Arrays;
import java.util.Collections;

/**
Two strings are anagrams of each other if the letters of one string can be rearranged to form the other string.
Given a string, find the number of pairs of substrings of the string that are anagrams of each other.
Examples
- "mom"
   [m, m] [mo, om]
- "abba"
   [a,a] [ab,ba] [b,b] [abb, bba]
*/

public class PairsOfSubstringsAreAnagrams {
	
	public int getNumberOfAnagrams(String stringValue) {
		
		String reversedString = reverseString(stringValue);
		int count = 0;
		// iterate the substrings
		for (int iniSub=0; iniSub<stringValue.length()/2; iniSub++) {
			
			for (int endSub=iniSub+1; endSub<stringValue.length()-iniSub; endSub++) {
				String subAnagram1 = stringValue.substring(iniSub, endSub);
				String subAnagram2 = reversedString.substring(iniSub, endSub);
				
				if (areAnagrams(subAnagram1, subAnagram2)) {
					System.out.println("Anagrama: " + subAnagram1);
					count++;
				}
			}			
		}
		System.out.println("Total: " + count + "\n");
		return count;
		
	}
	
	
	private boolean isAnagram(String substringAnagram) {		
		if (substringAnagram.length() == 1) {
			return true;
		} else {
			int lastIndex = substringAnagram.length()-1;
			for (int i=0; i<substringAnagram.length()/2; i++) {				
				if (substringAnagram.charAt(i) != substringAnagram.charAt(lastIndex-1)) {
					return false;
				}
			}
		}
		return true;		
	}
	
	private boolean areAnagrams(String word1, String word2) {		
		if (word1.equalsIgnoreCase(word2)) {
			return true;
		}		
		return false;		
	}
	
	private String reverseString(String valueToReverse) {
		StringBuilder s = new StringBuilder();
		for (int i = valueToReverse.length()-1; i>=0; i--) {
			s.append(valueToReverse.charAt(i));
		}				
		return String.valueOf(s);
	}

}
