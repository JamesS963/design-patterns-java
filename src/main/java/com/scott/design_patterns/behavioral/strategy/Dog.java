package com.scott.design_patterns.behavioral.strategy;

public class Dog extends Animal {

	public Dog(int age) {
		super(age, new Bark());
	}
}
