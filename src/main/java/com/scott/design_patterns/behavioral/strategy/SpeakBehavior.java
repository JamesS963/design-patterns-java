package com.scott.design_patterns.behavioral.strategy;

/*
 * Implementation of the strategy pattern.
 * This is an interface that is implemented by several different classes which have the same method calls but provide different functionality
 * depending on the class.
 * This pattern helps our code abide by the open/closed principle by creating more classes that implement the interface instead of
 * adding functionality directly to the class, making the code more maintainable in the long run.
 */

public interface SpeakBehavior {
	public String speak();
}
