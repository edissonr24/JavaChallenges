package com.exercises.AlgorithmicChallenges;

public class StringIsRotationOfOther {
	
	public boolean string2IsRotationOfString1(String input1, String input2) {
		String duplicatedInput1 = input1 == null?"":input1.concat(input1);
		String valueInput2 = input2 == null?"":input2;
		
		System.out.println("Input1 duplicated: " + duplicatedInput1);
		System.out.println("Input2: " + valueInput2);
		return duplicatedInput1.contains(valueInput2);
	}

}
