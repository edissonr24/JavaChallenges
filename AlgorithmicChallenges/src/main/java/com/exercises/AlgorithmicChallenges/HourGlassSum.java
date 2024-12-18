package com.exercises.AlgorithmicChallenges;

import java.util.List;

public class HourGlassSum {
	
	public int sum(List<List<Integer>> matrix) {
		
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		int rowSize = matrix.get(0).size()-2;
		//System.out.println("rowSize; " + rowSize);
		//System.out.println("matrixSize; " + matrix.size());
		for (int i=0; i<rowSize;i++) {
			for (int j=0; j<rowSize; j++) {
				sum = matrix.get(i).get(j) + matrix.get(i).get(j+1) + matrix.get(i).get(j+2) +
									      matrix.get(i+1).get(j+1) +
					  matrix.get(i+2).get(j) + matrix.get(i+2).get(j+1) + matrix.get(i+2).get(j+2);

				if (sum > maxSum)
					maxSum = sum;
				
			}
			
		}	
				
		return maxSum;
		
	}

}
