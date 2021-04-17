package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithms.datastructures.StackArray;

public class StackArrayTest {
	
	@Test
	public void testValidisEmpty () {
		StackArray pman = new StackArray();
		boolean valid = pman.isEmpty();
		assertTrue(valid); 		
	}
}
