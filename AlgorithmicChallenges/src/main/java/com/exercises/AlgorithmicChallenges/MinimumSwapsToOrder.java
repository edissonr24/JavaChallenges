package com.exercises.AlgorithmicChallenges;

public class MinimumSwapsToOrder {

	public int getMinimumSwapsToOrder(int[] arrayInt) {
		
		int c = 0;
		
		for (int i=0; i<arrayInt.length; i++) {
			
			if (arrayInt[i] != i+1) {
				int index = getIndex(i+1, arrayInt);
				int move = arrayInt[i];
				arrayInt[i] = arrayInt[index];				
				arrayInt[index] = move;
				c++;
			}
			
			// Show Array
			for (int j = 0; j < arrayInt.length; j++) {
	            System.out.print(arrayInt[j]);	            
	        }
			System.out.println("");
		}
		System.out.println("Swaps: " + c);
		return c;		
	}
	
	
	public int getIndex(int index, int[] array) {
		
		int indexFound = 0;
		for (int i=0; i<array.length; i++) {
			if (array[i] == index) {
				indexFound = i;
				break;
			}
		}
		return indexFound;
		
	}
	
}
