package com.travis;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Fibonacci suite :");
		
		for(int n=0;n<=20;n++) {
			System.out.println("Fibonacci("+n+") = "+Fibonacci.FibonacciSuite(n));
		}
		
		
	}
}
