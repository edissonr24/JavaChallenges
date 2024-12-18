package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramStringTest {

	private AnagramString anagramString;
	
	@BeforeEach
	void initialSetup() {
		anagramString = new AnagramString();
	}
	
	@Test
	void test1() {
		boolean isAnagram = anagramString.isAnagram("casa", "sapo");
		assertFalse(isAnagram);
	}
	
	@Test
	void test2() {
		boolean isAnagram = anagramString.isAnagram("casado", "sacado");
		assertTrue(isAnagram);
	}
	
	@Test
	void test3() {
		boolean isAnagram = anagramString.isAnagram("CASA", "saca");
		assertTrue(isAnagram);
	}
	
	@Test
	void test4() {
		boolean isAnagram = anagramString.isAnagram("CA SA", "sa ca");
		assertTrue(isAnagram);
	}
	
	@Test
	void test5() {
		boolean isAnagram = anagramString.isAnagram("Monkeys Write", "New York Times");
		assertFalse(isAnagram);
	}

	@Test
	void test6() {
		boolean isAnagram = anagramString.isAnagram("Monkeys Write", "NewYork Times");
		assertTrue(isAnagram);
	}


}
