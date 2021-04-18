package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithms.datastructures.StackArray;

public class StackArrayTest {
	
	@Test
	public void testInitialSize() {
		StackArray myStack = new StackArray();
		int tamanho = myStack.size();
		boolean valid = (tamanho == 0);
		assertTrue(valid); 		
	}
	
	@Test
	public void testValidisEmpty () {
		StackArray myStack = new StackArray();
		boolean valid = myStack.isEmpty();
		assertTrue(valid); 		
	}
	
	@Test
	public void testIsNoEmpty () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		boolean valid = myStack.isEmpty();
		assertFalse(valid); 		
	}
	
	@Test
	public void testPopPush () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		int dado = myStack.pop();
		boolean valid = (dado == 5);
		assertTrue(valid); 		
	}
}
