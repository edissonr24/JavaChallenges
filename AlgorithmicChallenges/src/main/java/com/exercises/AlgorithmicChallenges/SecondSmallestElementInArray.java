package com.exercises.AlgorithmicChallenges;

import java.util.Arrays;

public class SecondSmallestElementInArray {
	
	public int getSecondElement(int[] arrayInt) {
		
		//Arrays.sort(arrayInt);
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i<arrayInt.length; i++) {
			if (arrayInt[i] < secondSmallest) {
				if (arrayInt[i] < smallest) {
					secondSmallest = smallest;
					smallest = arrayInt[i];
				} else {
					secondSmallest = arrayInt[i];
				}				
			}
			System.out.println("Smallest: " + smallest + " Second Samallest: " + secondSmallest);
		}		
		return secondSmallest;
	}
}


//smallest = 100 
//secondSmallest = 1100
