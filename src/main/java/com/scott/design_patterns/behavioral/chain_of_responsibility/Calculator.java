package com.scott.design_patterns.behavioral.chain_of_responsibility;

public class Calculator {

	Chain add = new Add();
	Chain subtract = new Subtract();
	Chain multiply = new Multiply();
	Chain divide = new Divide();

	public Calculator() {

		multiply.setNextChain(divide);
		subtract.setNextChain(multiply);
		add.setNextChain(subtract);

	}

	public int calculate(Calculation calculation) {
		return add.calculate(calculation);
	};
}
