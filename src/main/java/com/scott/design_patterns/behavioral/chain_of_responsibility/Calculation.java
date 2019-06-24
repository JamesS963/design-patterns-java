package com.scott.design_patterns.behavioral.chain_of_responsibility;

/*
 * Class to build the chain of responsibility
 * The purpose of the chain of responsibility is to send a set of data through a series of similar functions, those functions
 * work out if they can do anything with the function and depending on the chain will either pass it 
 * through to the next item of the chain or return the value.
 */
public class Calculation {
	private int numberOne;
	private int numberTwo;
	private char calculation;

	public Calculation(int numberOne, int numberTwo, char calculation) {
		super();
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.calculation = calculation;
	}

	public int getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}

	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public char getCalculation() {
		return calculation;
	}

	public void setCalculation(char calculation) {
		this.calculation = calculation;
	}

}
