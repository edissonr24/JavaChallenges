package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecondSmallestElementInArrayTest {
	
	SecondSmallestElementInArray secondSmallestElementInArray;
	
	@BeforeEach
	void initTest() {
		secondSmallestElementInArray = new SecondSmallestElementInArray();
	}
	

	@Test
	void test() {
		assertEquals(2, secondSmallestElementInArray.getSecondElement(new int[] {1,2,3,5,6}));
	}
	
	
	@Test
	void test2() {
		assertEquals(4, secondSmallestElementInArray.getSecondElement(new int[] {7,9,3,5,6,4}));
	}
	
	@Test
	void test3() {
		assertEquals(-6, secondSmallestElementInArray.getSecondElement(new int[] {7,-9,3,5,-6,4}));
	}
	

}
