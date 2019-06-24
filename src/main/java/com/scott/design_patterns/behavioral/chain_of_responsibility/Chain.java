package com.scott.design_patterns.behavioral.chain_of_responsibility;

public interface Chain {

	public void setNextChain(Chain nextInChain);

	public int calculate(Calculation calculation);

}
