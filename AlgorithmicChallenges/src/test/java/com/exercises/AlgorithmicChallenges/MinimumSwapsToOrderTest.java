package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumSwapsToOrderTest {
	
	MinimumSwapsToOrder minimumSwapsToOrder;
	
	@BeforeEach
	void initTest( ) {
		minimumSwapsToOrder = new MinimumSwapsToOrder();
	}
	

	@Test
	void test() {		
		assertEquals(5, minimumSwapsToOrder.getMinimumSwapsToOrder(new int[] {7, 1, 3, 2, 4, 5, 6}));
	}
	
	@Test
	void test2() {		
		assertEquals(3, minimumSwapsToOrder.getMinimumSwapsToOrder(new int[] {1, 3, 5, 2, 4, 6, 7}));
	}

}
