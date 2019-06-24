package com.scott.design_patterns.creational;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.scott.design_patterns.creational.singleton.Singleton;

public class SingletonTest {

	@Test
	public void test_ThatTwoSingletonObjectsReferToTheSameObjectInMemory_WhenTwoSingletonObjectsAreCreated() {
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = Singleton.getInstance();
		
		assertTrue(instanceOne == instanceTwo);
	}
}
