package com.scott.design_patterns.behavioral.chain_of_responsibility;

public class Divide implements Chain {

	public void setNextChain(Chain nextInChain) {

	}

	public int calculate(Calculation calculation) {

		if (calculation.getCalculation() == '/')
			return calculation.getNumberOne() / calculation.getNumberTwo();

		return 0;
	}
}
