package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmallestMissingValueTest {

	SmallestMissingValue smallestMissingValue;
	
	@BeforeEach
	void initSetup() {
		smallestMissingValue = new SmallestMissingValue();
	}
	
	@Test
	void test() {
		assertEquals(4, smallestMissingValue.getSmallestMissingValue(new int[] {0,1,2,3,5,6,7}));
	}
	
	@Test
	void test2() {
		assertEquals(0, smallestMissingValue.getSmallestMissingValue(new int[] {4, 5, 10, 11}));
	}
	
	@Test
	void test3() {
		assertEquals(4, smallestMissingValue.getSmallestMissingValue(new int[] {0, 1, 2, 3}));
	}

}
