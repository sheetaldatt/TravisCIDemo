package com.sheetal.TravisCIDemo;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleMathTests {

	SimpleMath math;

	@Before
	public void setUp() throws Exception {
		math = new SimpleMath();
	}

	@Test
	public void testAdd() {
		assertTrue(math.add(2, 3) == 5);
	}

	@Test
	public void testSubtract() {
		assertTrue(math.subtract(6, 3) == 3);
	}

	@Test
	public void testDivide() {
		assertTrue(math.divide(10, 2) == 5);
	}

	@Test
	public void testMultiply() {
		assertTrue(math.multiply(12, 3) == 36);
	}

	@Test
	public void testGetNumberOfCalculatedOperations() {
		long operationsOld = math.getNumberOfCalculatedOperations();
		math.add(1, 1);
		math.add(2, 2);
		math.add(3, 3);
		math.add(4, 4);
		assertEquals(math.getNumberOfCalculatedOperations(), operationsOld + 4);
	}

}
 

