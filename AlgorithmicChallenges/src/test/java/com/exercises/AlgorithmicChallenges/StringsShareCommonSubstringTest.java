package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringsShareCommonSubstringTest {

	StringsShareCommonSubstring stringsShareCommonSubstring;
	
	@BeforeEach
	void initSetup() {
		stringsShareCommonSubstring = new StringsShareCommonSubstring();
	}
	
	@Test
	void test1() {
		assertTrue(stringsShareCommonSubstring.checkStringWithSize("Ejemplouno", "Ejerciciouno", 3));
	}
	
	@Test
	void test2() {
		assertFalse(stringsShareCommonSubstring.checkStringWithSize("Ejamplousa", "Ejerciciouno", 3));
	}
	
	@Test
	void test3() {
		assertTrue(stringsShareCommonSubstring.checkStringWithSize("Ejemplouno", "Ejerciciouno", 4));
	}
	
	@Test
	void test4() {
		assertFalse(stringsShareCommonSubstring.checkStringWithSize("Ejemplouno", "Ejerciciouno", 5));
	}
	

}
