package com.exercises.AlgorithmicChallenges;

import java.util.HashSet;
import java.util.Set;

public class StringUniqueCharacters {
	
	public boolean hasUniqueCharacters(String input) {
		
		if (input == null || input.length()==0) {
			return true;
		}
		
		Set<Character> uniqueCharacters = new HashSet<Character>();
		for (char c : input.toCharArray()) {
			uniqueCharacters.add(c);
		}
		
		if (uniqueCharacters.size() == input.length()) {
			return true;
		}
		return false;
		
	}

}
