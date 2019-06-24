package com.scott.design_patterns.behavioral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.scott.design_patterns.behavioral.chain_of_responsibility.Calculation;
import com.scott.design_patterns.behavioral.chain_of_responsibility.Calculator;

public class ChainOfResponsibilityTest {

	Calculator calculator = new Calculator();

	@Test
	public void test_ThatChainAdds_WhenAdditionCharachterIsUsed() {
		int result = calculator.calculate(new Calculation(5,5,'+'));
		assertEquals(10, result);
	}
	
	@Test
	public void test_ThatChainSubtracts_WhenSubtractionCharachterIsUsed() {
		int result = calculator.calculate(new Calculation(5,5,'-'));
		assertEquals(0, result);
	}
	
	@Test
	public void test_ThatChainMultiplies_WhenMultiplicationCharachterIsUsed() {
		int result = calculator.calculate(new Calculation(5,5,'*'));
		assertEquals(25, result);
	}
	
	@Test
	public void test_ThatChainDivides_WhenDivisionCharachterIsUsed() {
		int result = calculator.calculate(new Calculation(5,5,'/'));
		assertEquals(1, result);
	}

	@Test
	public void test_ThatChainReturnsZero_WhenUnKnownCharachterIsUsed() {
		int result = calculator.calculate(new Calculation(5,5,'a'));
		assertEquals(0, result);
	}
	
}
