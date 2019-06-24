package com.scott.design_patterns.behavioral.chain_of_responsibility;

public class Multiply implements Chain {
	private Chain nextInChain;

	public void setNextChain(Chain nextInChain) {
		this.nextInChain = nextInChain;

	}

	public int calculate(Calculation calculation) {

		if (calculation.getCalculation() == '*')
			return calculation.getNumberOne() * calculation.getNumberTwo();

		return nextInChain.calculate(calculation);
	}
}
