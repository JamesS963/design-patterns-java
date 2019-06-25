package com.scott.design_patterns.behavioral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.scott.design_patterns.behavioral.strategy.Animal;
import com.scott.design_patterns.behavioral.strategy.Cow;
import com.scott.design_patterns.behavioral.strategy.Dog;

public class StrategyTest {

	@Test
	public void TestThatDogBarksAtRuntime() {
		Animal animal = new Dog(12);
		String expectedNoise = "Woof!";
		assertEquals(expectedNoise, animal.speak());
	}

	/*
	 * the purpose of this test is to show that the animal variable can be changed
	 * at runtime to impliment different functionality for speak depending on the
	 * type of animal created.
	 */
	@Test
	public void TestThatCowMoosWhenAnimalIsChangedToCow() {
		Animal animal = new Dog(12);
		animal = new Cow(22);
		String expectedNoise = "Moo!";
		assertEquals(expectedNoise, animal.speak());
	}

}
