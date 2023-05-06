package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverseString;
	
	@BeforeEach
	void initSetup() {
		reverseString = new ReverseString();
	}

	@Test
	void test() {
		assertEquals("7654321", reverseString.reverse("1234567"));
	}
	
	@Test
	void test2() {
		assertEquals(null, reverseString.reverse(null));
	}
	
	@Test
	void test3() {
		assertEquals("", reverseString.reverse(""));
	}

}
