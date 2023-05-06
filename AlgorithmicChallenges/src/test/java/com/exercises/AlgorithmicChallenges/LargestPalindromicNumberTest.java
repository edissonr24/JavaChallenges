package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestPalindromicNumberTest {

	LargestPalindromicNumber largestPalindromicNumber;
	
	@BeforeEach
	void initSetup() {
		largestPalindromicNumber = new LargestPalindromicNumber();
	}
	
	@Test
	void test() {
		assertEquals(232, largestPalindromicNumber.getLargestPalindromicNumber(12322));
	}
	
	@Test
	void test2() {
		assertNotEquals(454, largestPalindromicNumber.getLargestPalindromicNumber(12322));
	}
	
	@Test
	void test3() {
		assertEquals(282, largestPalindromicNumber.getLargestPalindromicNumber(1232282));
	}

}
