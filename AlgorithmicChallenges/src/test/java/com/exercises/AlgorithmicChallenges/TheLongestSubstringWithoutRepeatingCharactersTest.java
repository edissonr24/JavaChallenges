package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TheLongestSubstringWithoutRepeatingCharactersTest {

	TheLongestSubstringWithoutRepeatingCharacters theLongestSubstringWithoutRepeatingCharacters;
	
	@BeforeEach
	void initSetup() {
		theLongestSubstringWithoutRepeatingCharacters = new TheLongestSubstringWithoutRepeatingCharacters();
	}
	
	@Test
	void test() {
		assertEquals("abc", theLongestSubstringWithoutRepeatingCharacters.getTheLongestSubstring("abca"));
	}
	
	@Test
	void test2() {
		assertNotEquals("abc", theLongestSubstringWithoutRepeatingCharacters.getTheLongestSubstring("abcda"));
	}
	
	@Test
	void test3() {
		assertEquals("fsabcde", theLongestSubstringWithoutRepeatingCharacters.getTheLongestSubstring("adfsabcdefsa"));
	}

}
