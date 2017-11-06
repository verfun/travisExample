package com.travis;

public class Fibonacci {
	
	public static int FibonacciSuite(int n) {
		if(n == 0) {
			return 0; 
		} else if(n == 1) {
			return 1;
		}else {
			return FibonacciSuite(n-1) + FibonacciSuite(n-2);
		}
	}
	
	public static int MySuite(int i) {
		if( i == 0) {
			return 1;
		}else {
			return 2*MySuite(i-1); 
		}
	}

}
