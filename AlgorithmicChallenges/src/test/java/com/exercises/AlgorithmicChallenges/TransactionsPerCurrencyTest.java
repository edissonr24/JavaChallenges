package com.exercises.AlgorithmicChallenges;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionsPerCurrencyTest {

	private TransactionsPerCurrency transactionsPerCurrency;

	@BeforeEach
	public void initialSetUp() {
		this.transactionsPerCurrency = new TransactionsPerCurrency();
	}

	@Test
	public void test1() {
		final Map<String, Long> tx1 = new HashMap<String, Long>();
		tx1.put("EUR", 100L);
		tx1.put("USD", 200L);
		final Map<String, Long> tx2 = new HashMap<String, Long>();
		tx2.put("USD", 200L);
		tx2.put("COP", 400L);
		final Map<String, Long> tx3 = new HashMap<String, Long>();
		tx3.put("USD", 300L);
		tx3.put("COP", 500L);

		final Map<String, Long> rdo = 
				this.transactionsPerCurrency.getTransactionsPerCurrency(Arrays.asList(tx1, tx2, tx3));

		Assertions.assertEquals(100L, rdo.get("EUR"));
		Assertions.assertEquals(200L + 200L + 300L, rdo.get("USD"));
		Assertions.assertEquals(400L + 500L, rdo.get("COP"));
	}

}
