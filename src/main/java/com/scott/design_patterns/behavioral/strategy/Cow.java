package com.scott.design_patterns.behavioral.strategy;

public class Cow extends Animal {

	public Cow(int age) {
		super(age, new Moo());
	}

}
