package com.exercises.AlgorithmicChallenges;

import java.util.HashSet;
import java.util.Set;

public class TheLongestSubstringWithoutRepeatingCharacters {

	public String getTheLongestSubstring(String value) {
		
		String longestSubstring = "";
		
		for (int i=0; i<value.length()-1;i++) {
			for(int j=i+1; j<value.length();j++) {
				String actual = value.substring(i,j);
				System.out.println("actual: " + actual);
				boolean hasRepeated = hasRepeatedCharacters(actual);
				if (!hasRepeated) {
					if (actual.length()>longestSubstring.length()) {
						longestSubstring = actual;
					}
				}
			}
		}
		System.out.println("Longest: " + longestSubstring);
		return longestSubstring;
	}
	
	private boolean hasRepeatedCharacters(String stringValue) {
		
		Set<Character> distinctValues = new HashSet<Character>(); 
		for(Character c : stringValue.toCharArray()) {
			distinctValues.add(c);
		}
		if (distinctValues.size()==stringValue.length()) {
			return false;
		}			
		
		return true;		
		
	}
	
}
