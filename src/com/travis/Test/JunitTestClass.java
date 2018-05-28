package com.travis.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.travis.Fibonacci;

public class JunitTestClass {
	
	@Test
	public  void TestFibonacci() {
		int expected1 = 1;
		int expected2 = 75025;
		int output1 = Fibonacci.FibonacciSuite(1);
		int output2 = Fibonacci.FibonacciSuite(25);
		assertEquals(expected1, output1);
		assertEquals(expected2, output2);
	}

}
