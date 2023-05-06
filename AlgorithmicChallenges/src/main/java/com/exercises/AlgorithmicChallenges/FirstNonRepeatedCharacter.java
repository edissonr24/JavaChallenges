package com.exercises.AlgorithmicChallenges;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	public char getFirstNonRepeatedCharacter(String value1) {
	
		
		LinkedHashMap<Character, Integer> characterCount = new LinkedHashMap<Character, Integer>();
		char[] arrayString = value1.toCharArray();
		
		for (Character c : arrayString) {
			if (characterCount.containsKey(c)) {
				characterCount.put(c, characterCount.get(c)+1);				
			} else {
				characterCount.put(c, 1);
			}
		}
		System.out.println(characterCount.toString());
		
		char t = ' ';
		for (Character key : characterCount.keySet()) {
			if (characterCount.get(key) == 1) {
				t = key;
				break;
			}
		}
				
		return t;
	}

}
