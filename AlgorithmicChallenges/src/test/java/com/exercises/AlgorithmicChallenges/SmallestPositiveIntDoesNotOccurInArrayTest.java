package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmallestPositiveIntDoesNotOccurInArrayTest {

	SmallestPositiveIntDoesNotOccurInArray smallestPositiveIntDoesNotOccurInArray;
	
	@BeforeEach
	void initSetup() {
		smallestPositiveIntDoesNotOccurInArray = new SmallestPositiveIntDoesNotOccurInArray();
	}
	
	@Test
	void test() {
		assertEquals(5, smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[] {1, 3, 0, 4, 1, 2}));
	}
	
	@Test
	public void test1() {
		assertEquals(4, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{3, 1, 2, 3, 0, 5, 6}));
	}

	@Test
	public void test2() {
		assertEquals(4, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{1, 2, 3}));
	}

	@Test
	public void test21() {
		assertEquals(3, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{1, 2}));
	}

	@Test
	public void test3() {
		assertEquals(1, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{-1, -3}));
	}

	@Test
	public void test4() {
		assertEquals(2, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{1}));
	}

	@Test
	public void test5() {
		assertEquals(1, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{2}));
	}

	@Test
	public void test6() {
		assertEquals(1, this.smallestPositiveIntDoesNotOccurInArray.getSmallestPositive(new int[]{3}));
	}

}
