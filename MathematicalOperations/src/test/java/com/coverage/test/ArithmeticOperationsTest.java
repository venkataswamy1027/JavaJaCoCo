package com.coverage.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coverage.demo.ArithmeticOperations;

public class ArithmeticOperationsTest {

	@Test
	public void testAdd() {
		ArithmeticOperations operations = new ArithmeticOperations();
		int actual = operations.add(2, 6);
		int expected = 8;
		assertEquals(expected, actual);
	}
}
