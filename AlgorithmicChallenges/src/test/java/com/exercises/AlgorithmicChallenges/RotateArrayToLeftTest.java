package com.exercises.AlgorithmicChallenges;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RotateArrayToLeftTest {

	RotateArrayToLeft rotateArrayToLeft;
	
	@BeforeEach
	void initSetup() {
		rotateArrayToLeft = new RotateArrayToLeft();
	}
	
	@Test
	void testArray() {
		int[] expected = {3, 4, 5, 1, 2};
		assertArrayEquals(expected, rotateArrayToLeft.rotateArray(new int[]{1,2,3,4,5}, 2));
	}
	
	@Test
	void testArray2() {
		int[] expected = {3, 4, 5, 1, 2};
		assertArrayEquals(expected, rotateArrayToLeft.rotateArray(new int[]{1,2,3,4,5}, 2));
	}
	
	@Test
	public void testArray3() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = rotateArrayToLeft.rotateArray(input, 3);
		assertArrayEquals(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3}, output);
	}

	@Test
	public void testArray4() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = rotateArrayToLeft.rotateArray(input, 11);
		assertArrayEquals(new int[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, output);
	}

	@Test
	public void testArray5() {
		final int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		final int[] output = rotateArrayToLeft.rotateArray(input, 12);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, output);
	}
	
	// LIST
	@Test
	void testList() { 
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(new Integer[] {3,4,5,1,2}));
		assertEquals(expected, rotateArrayToLeft.rotateList(Arrays.asList(new Integer[] {1,2,3,4,5}), 2));
	}

}
