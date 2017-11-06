package com.travis;

public class MainClass {

	public static void main(String[] args) {
		
		int maxNumberOfAttribute = 20;
		
		System.out.println("Fibonacci Sequence :");
		long startTime = System.currentTimeMillis();
		displayFibonacciSequence(maxNumberOfAttribute);
		long endTime = System.currentTimeMillis();
		System.err.println("Total time in execution for Fibonacci Sequence  :"+ ((double)(endTime-startTime)/100000) + "ms");
		
		
		System.out.println("MySuite Sequence :");
		startTime = System.currentTimeMillis();
		displayMySuiteSequence(maxNumberOfAttribute);
		endTime = System.currentTimeMillis();
		System.err.println("Total time in execution for MySuite Sequence  :"+ ((double)(endTime-startTime)/100000) + "ms");
	}
	
	public static void displayFibonacciSequence(int maxNumber) {
		for(int n=0; n<=maxNumber; n++) {
			System.out.println("Fibonacci("+n+") = "+Fibonacci.FibonacciSuite(n));
		}
	}
	
	public static void displayMySuiteSequence(int maxNumber) {
		for(int n=0; n<=maxNumber; n++) {
			System.out.println("MySuite("+n+") = "+Fibonacci.MySuite(n));
		}
	}
}
