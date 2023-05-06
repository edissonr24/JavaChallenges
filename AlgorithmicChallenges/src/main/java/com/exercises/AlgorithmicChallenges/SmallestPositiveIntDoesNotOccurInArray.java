package com.exercises.AlgorithmicChallenges;

/**
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

public class SmallestPositiveIntDoesNotOccurInArray {
	
	public int getSmallestPositive(int[] arrayInt) {
		
		boolean[] exist = new boolean[arrayInt.length+1];
		int smallestPositive = arrayInt.length;
		
		for (int i=0; i<arrayInt.length; i++ ) {
			if (arrayInt[i] > 0 && arrayInt[i] <= smallestPositive) {
				exist[arrayInt[i]] = true;	
			}			
		}
		
		for (int j=1; j<=arrayInt.length;j++) {
			if (exist[j] != true) {
				return j;
			}
		}		
		
		// if the value does not exist, return size + 1
		return smallestPositive + 1;		
	}
	
}
