package com.sheetal.TravisCIDemo;

public class SimpleMath {

	/**
	 * Stores the number of performed calculations.
	 */
	private long operations;

	/**
	 * Standard Constructor
	 */
	public SimpleMath() {
		operations = 0;
	}

	/**
	 * Adds two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public double add(double a, double b) {
		operations++;
		return a + b;
	}

	/**
	 * Subtracts two numbers from each other.
	 * 
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public double subtract(double a, double b) {
		operations++;
		return a - b;
	}

	/**
	 * Divides two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a / b
	 */
	public double divide(double a, double b) {
		operations++;
		return a / b;
	}

	/**
	 * Multiply two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a * b
	 */
	public double multiply(double a, double b) {
		operations++;
		return a * b;
	}

	/**
	 * Returns the number of calculations performed.
	 * 
	 * @return number of calculations performed
	 */
	public long getNumberOfCalculatedOperations() {
		return operations;
	}
}
