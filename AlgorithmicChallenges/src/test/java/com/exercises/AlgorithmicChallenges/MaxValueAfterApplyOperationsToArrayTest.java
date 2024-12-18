package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxValueAfterApplyOperationsToArrayTest {

	MaxValueAfterApplyOperationsToArray maxValueAfterApplyOperationsToArray;
	
	
	@BeforeEach
	void initSetup() {
		maxValueAfterApplyOperationsToArray = new MaxValueAfterApplyOperationsToArray();
	}
	
	@Test
	void test() {
		List<List<Integer>> operations = new ArrayList<List<Integer>>();
		operations.add(Arrays.asList(2,9,1));
		operations.add(Arrays.asList(1,5,3));
		operations.add(Arrays.asList(4,8,7));		
		assertEquals(11, maxValueAfterApplyOperationsToArray.getMaxValue(11, operations));		
	}

	@Test
	void test1() {
		List<List<Integer>> operations = new ArrayList<List<Integer>>();
		operations.add(Arrays.asList(1,5,3));
		operations.add(Arrays.asList(4,8,7));
		operations.add(Arrays.asList(6,9,1));		
		assertEquals(10, maxValueAfterApplyOperationsToArray.getMaxValue(10, operations));		
	}

}
