package com.scott.design_patterns.behavioral.strategy;

public class Animal {

	private int age;
	private SpeakBehavior speakBehavior;

	public Animal(int age, SpeakBehavior speakBehavior) {
		this.age = age;
		this.speakBehavior = speakBehavior;
	}

	public String speak() {
		return speakBehavior.speak();
	}

}
