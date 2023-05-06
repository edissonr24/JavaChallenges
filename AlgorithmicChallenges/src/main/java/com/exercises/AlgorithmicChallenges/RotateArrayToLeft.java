package com.exercises.AlgorithmicChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayToLeft {
	
	public int[] rotateArray(int[] arr, int movs) {
		
		int[] newArray = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			int newPosition = i-movs;
			if (newPosition < 0) {
				newPosition = arr.length+newPosition;
			}
			newArray[newPosition] = arr[i];
		}
		System.out.println(Arrays.toString(newArray));
		//return new Integer[] {3, 4, 5, 1, 2};
		return newArray;		
	}
	
	public List<Integer> rotateList(List<Integer> list, int movs) {
		
		List<Integer> newList = new ArrayList<Integer>(list.size());
		for (int i=0; i<list.size(); i++) {
			int oldPosition = i+movs;
			if (oldPosition > list.size()-1) {
				oldPosition = oldPosition -  list.size();
			}
			newList.add(i, list.get(oldPosition));
		}
		System.out.println(newList.toString());
		return newList;		
	}
	

}
