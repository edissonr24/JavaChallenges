package com.exercises.AlgorithmicChallenges;

/**
Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element 
between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
Example:
Operations:
    from   to  value_to_add
    1      5   3
    4      8   7
    6      9   1
   index->	  1 2 3  4  5 6 7 8 9 10
             [0,0,0, 0, 0,0,0,0,0, 0]
             [3,3,3, 3, 3,0,0,0,0, 0]
             [3,3,3,10,10,7,7,7,0, 0]
             [3,3,3,10,10,8,8,8,1, 0]
The largest value is 10 after all operations are performed.
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxValueAfterApplyOperationsToArray {

	public int getMaxValue(int size, List<List<Integer>> operations) {
		
		Integer[] arrayValues = new Integer[10];
		Arrays.fill(arrayValues, 0);
		int maxValue = Integer.MIN_VALUE; 
				
		for (int i=0; i<operations.size();i++) {
			
			int initial = operations.get(i).get(0);
			int end = operations.get(i).get(1);
			int sum = operations.get(i).get(2);
			
			for (int j=initial-1; j<=end-1; j++) {
				arrayValues[j] = arrayValues[j] + sum;				
			}			
		}
		
		maxValue = Collections.max(Arrays.asList(arrayValues));
		System.out.println("Max Value: " + maxValue);
		
		// Show Array Data
		for (int i = 0; i < arrayValues.length; i++) {
            System.out.println(arrayValues[i]);
        }
		
		return getMaxValue(arrayValues);
		//return maxValue;
	}	
	
	
	private int getMaxValue(Integer[] arrayInt) {		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arrayInt.length; i++) {
			if (arrayInt[i] > max ) {
				max = arrayInt[i];
			}
		}
		return max;
	}
	
}
