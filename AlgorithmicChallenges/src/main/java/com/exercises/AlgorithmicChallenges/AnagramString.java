package com.exercises.AlgorithmicChallenges;

import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
	
	public boolean isAnagram(String word1, String word2) {
		
		char arrayChar1[] = word1.toLowerCase().toCharArray();
		char arrayChar2[] = word2.toLowerCase().toCharArray();
		
		Arrays.sort(arrayChar1);
		Arrays.sort(arrayChar2);
		
		for (char a:arrayChar1) {
			System.out.println(String.valueOf(a));
		}
		
		for (char b:arrayChar2) {
			System.out.println(String.valueOf(b));
		}
		
		if (word1.length() != word2.length()) {
			return false;
		}
		
		for (int i=0; i<arrayChar1.length; i++) {
			if (!String.valueOf(arrayChar1[i]).equalsIgnoreCase(String.valueOf(arrayChar2[i]))) {
				return false;
			}
			
		}		
		return true;
		
	}

}
