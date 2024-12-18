package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ALetterAppearBeforeBLetterTest {

	private ALetterAppearBeforeBLetter aLetterAppearBeforeBLetter;
	
	@BeforeEach
	void initialSetup() {
		aLetterAppearBeforeBLetter = new ALetterAppearBeforeBLetter();
	}
	
	@Test
	void test1() {
		boolean result = aLetterAppearBeforeBLetter.checkWord("aaa");
		assertFalse(result);
	}
	
	@Test
	void test2() {
		boolean result = aLetterAppearBeforeBLetter.checkWord("aaab");
		assertFalse(result);
	}
	
	@Test
	void test3() {
		boolean result = aLetterAppearBeforeBLetter.checkWord("abab");
		assertTrue(result);
	}
	
	@Test
	void test4() {
		boolean result = aLetterAppearBeforeBLetter.checkWord("ababa");
		assertTrue(result);
	}
	
	@Test
	void test5() {
		boolean result = aLetterAppearBeforeBLetter.checkWord("abbbb");
		assertTrue(result);
	}

}
