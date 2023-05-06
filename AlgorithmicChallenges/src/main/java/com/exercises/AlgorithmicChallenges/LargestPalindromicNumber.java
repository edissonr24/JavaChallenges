package com.exercises.AlgorithmicChallenges;

public class LargestPalindromicNumber {

	public int getLargestPalindromicNumber(int num) {
		
		String numString = String.valueOf(num);
		int largestPalin = 0;
		
		for (int i=0; i<numString.length(); i++) {
			for (int j=i+1; j<=numString.length(); j++) {
				
				String numActual = numString.substring(i,j);
				System.out.println("Num actual: " + numActual);
				if (isPalindromic(numActual)) {
					if (Integer.parseInt(numActual) > largestPalin) {
						largestPalin = Integer.parseInt(numActual);
					}
				}
				
			}
		}		
		System.out.println("Largest: " + largestPalin);
		return largestPalin;
		
	}
	
	
//	private boolean isPalindromic(int num) {
//				
//		char[] numberArray = String.valueOf(num).toCharArray();
//		int arrayLast = numberArray.length-1;
//		for (int i=0; i<=numberArray.length/2;i++) {
//			if (numberArray[i] != numberArray[arrayLast-i]) {
//				return false;
//			}
//		}
//		return true;		
//	}
	
	private boolean isPalindromic(String num) {
		
		char[] numberArray = String.valueOf(num).toCharArray();
		int arrayLast = numberArray.length-1;
		for (int i=0; i<=numberArray.length/2;i++) {
			if (numberArray[i] != numberArray[arrayLast-i]) {
				return false;
			}
		}
		return true;		
	}
	
	
}

/*
1234567
i --> 3

1 7
2 6
3 5

12345678
i --> 4
1 8
2 7
3 6
4 5
*/
