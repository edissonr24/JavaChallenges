package com.exercises.AlgorithmicChallenges;

import static org.junit.Assert.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RearrangeArrayAtEvenOrOddPositionTest {

	RearrangeArrayAtEvenOrOddPosition rearrangeArrayAtEvenOrOddPosition;
	
	@BeforeEach
	void initSetup() {
		rearrangeArrayAtEvenOrOddPosition = new RearrangeArrayAtEvenOrOddPosition();
	}
	
	// Deprecated
//	@Test
//	void test() {
//		Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};
//		Integer[] expected = {1, 3, 2, 5, 4, 7, 6};
//		assertEquals(expected, rearrangeArrayAtEvenOrOddPosition.rearrangeArray(myArray));
//	}
	
	@Test
	void test() {
		Integer[] myArray = {1, 2, 3, 4, 5, 6, 7};
		Integer[] expected = {1, 3, 2, 5, 4, 7, 6};
		assertArrayEquals(expected, rearrangeArrayAtEvenOrOddPosition.rearrangeArray(myArray));
	}

}
