package com.scott.design_patterns.creational.singleton;

/*
 * Written By James Scott.
 * The following code is an example of the singleton design pattern.
 * The purpose of this is to create a single instance of an object which can be accessed by the entire application meaning that if
 * anything changes in the object it will change for any functionality using this object.
 * new instances of the object will all point to the same memory address.
 */

public class Singleton {
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();

		return instance;
	}

}
