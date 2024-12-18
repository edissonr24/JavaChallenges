package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstNonRepeatedCharacterTest {

	private FirstNonRepeatedCharacter firstNonRepeatedCharacter;
	
	@BeforeEach
	void initSetup() {
		firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
	}
	
	
	@Test
	void test() {
		assertEquals('m', firstNonRepeatedCharacter.getFirstNonRepeatedCharacter("tomato"));
	}
	
	@Test
	void test2() {
		assertNotEquals('t', firstNonRepeatedCharacter.getFirstNonRepeatedCharacter("tomato"));
	}
	
	@Test
	void test3() {
		assertNotEquals('w', firstNonRepeatedCharacter.getFirstNonRepeatedCharacter("tomato"));
	}

}
