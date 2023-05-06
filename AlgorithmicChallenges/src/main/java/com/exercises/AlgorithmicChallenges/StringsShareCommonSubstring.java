package com.exercises.AlgorithmicChallenges;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
Given two strings, determine if they share a common substring. A substring may be as small as 
one character.
Example:
- These share the common substring:
   "and"
   "art"
   Share "a"
- These do not share a substring:
   "be"
   "cat"
*/

public class StringsShareCommonSubstring {

	public boolean checkString(String value1, String value2) {
		
		final Set<Character> s1CharsSet = value1.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        final Set<Character> s2CharsSet = value2.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toCollection(LinkedHashSet::new));
		
        System.out.println(s1CharsSet.toString());
        System.out.println(s2CharsSet.toString());
        
        return true;
        
	}
	
public boolean checkStringWithSize(String value1, String value2, int size) {
		
		Set<String> setStringA = new HashSet<String>();
		Set<String> setStringB = new HashSet<String>();
		
		int finA = value1.length()-size;
		for(int i=0; i<=finA; i++) {
			System.out.println(value1.substring(i,i+size));
			setStringA.add(value1.substring(i,i+size));
		}
		System.out.println(setStringA.toString());
		
		int finB = value2.length()-size;
		for(int j=0; j<=finB; j++) {
			System.out.println(value2.substring(j,j+size));
			setStringB.add(value2.substring(j,j+size));
		}	       
        System.out.println(setStringB.toString());
        
        
        for (String stringA : setStringA) {
        	if (setStringB.contains(stringA)) {
        		return true;
        	}
        }
        
        
        return false;
        
	}
}
