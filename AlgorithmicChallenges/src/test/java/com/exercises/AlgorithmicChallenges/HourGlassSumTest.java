package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HourGlassSumTest {
	
	HourGlassSum hourGlassSum;
	
	
	@BeforeEach
	void initSetup() {
		hourGlassSum = new HourGlassSum();
	}
	

	@Test
	void test() {
		final List<Integer> row1 = Arrays.asList(-9, -9, -9, 1, 1, 1);
		final List<Integer> row2 = Arrays.asList(0, -9,  0,  4, 3, 2);
		final List<Integer> row3 = Arrays.asList(-9, -9, -9, 1, 2, 3);
		final List<Integer> row4 = Arrays.asList(0, 0, 8, 6, 6, 0);
		final List<Integer> row5 = Arrays.asList(0, 0, 0, -2, 0, 0);
		final List<Integer> row6 = Arrays.asList(0, 0, 1, 2, 4, 0);
		
		final List<List<Integer>> matrix = Arrays.asList(row1, row2, row3, row4, row5, row6);
		
		assertEquals(28, hourGlassSum.sum(matrix));
		
	}
	
	

}
