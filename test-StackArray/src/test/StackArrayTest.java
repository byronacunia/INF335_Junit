package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import algorithms.datastructures.StackArray;

public class StackArrayTest {
	
	/*O tamanho inicial da pilha é o esperado?
	 * Resposta: Sim
	 * Validado nos testes: 
	 * testInitialSize()
	 * testValidisEmpty () 
	 * testIsNoEmpty ()
	 * */
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
	
	/*Os valores dos elementos retirados da pilha corresponde com aqueles que foram inseridos?
	 * Resposta: Sim
	 * Validado nos testes:
	 *  testPopPush ()   
	 * */	
	@Test
	public void testPopPush () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		int dado = myStack.pop();
		boolean valid = (dado == 5);
		assertTrue(valid); 		
	}
	
	@Test
	public void testPeek () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		int dado = myStack.peek();
		assertEquals(7, myStack.peek());
	}
	
	
	@Test
	public void testOrdemValoresRetiradosInseridos () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.pop());
	}
	
	@Test
	public void testEmptyAgain () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.pop());
		assertEquals(true, myStack.isEmpty());
	}
}
