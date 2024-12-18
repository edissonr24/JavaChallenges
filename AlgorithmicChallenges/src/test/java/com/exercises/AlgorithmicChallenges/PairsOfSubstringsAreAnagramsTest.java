package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PairsOfSubstringsAreAnagramsTest {

	PairsOfSubstringsAreAnagrams pairsOfSubstringsAreAnagrams;
	
	@BeforeEach
	void initSetup() {
		pairsOfSubstringsAreAnagrams = new PairsOfSubstringsAreAnagrams();
	}
	
	@Test
	void test() {
		assertEquals(2, pairsOfSubstringsAreAnagrams.getNumberOfAnagrams("mom"));
	}
	
	@Test
	void test2() {
		assertEquals(4, pairsOfSubstringsAreAnagrams.getNumberOfAnagrams("abba"));
	}
	
	@Test
	void test3() {
		assertEquals(0, pairsOfSubstringsAreAnagrams.getNumberOfAnagrams("ifailuhkqq"));
	}
	
	@Test
	void test4() {
		assertEquals(15, pairsOfSubstringsAreAnagrams.getNumberOfAnagrams("sacasabcsacas"));
	}

}
