package com.exercises.AlgorithmicChallenges;

public class ReverseString {
	
	public String reverse(String valueToReverse) {
		
		if (valueToReverse == null) {
			return null;
		}
		StringBuilder text = new StringBuilder();
		for (int i=valueToReverse.length()-1; i>=0; i--) {
			text.append(valueToReverse.charAt(i));			
		}
		System.out.println(text);
		return text.toString();
	}

}
