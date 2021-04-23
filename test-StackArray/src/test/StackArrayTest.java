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
	 * Validado no teste:
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
	
	/*Os elementos são retirados da pilha na ordem correta?
	 * Resposta: Sim
	 * Validado no teste:
	 *  testOrdemValoresRetiradosInseridos  ()   
	 * */
	@Test
	public void testOrdemValoresRetiradosInseridos () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.pop());
	}
	
	/*A função peek (verifica o valor no topo da pilha) funciona corretamente?
	 * Resposta: Sim
	 * Validado no teste:
	 *  testPeek ()   
	 * */
	@Test
	public void testPeek () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		int dado = myStack.peek();
		assertEquals(7, myStack.peek());
	}
	
	/*A função peek (verifica o valor no topo da pilha) funciona corretamente quando a pilha está
vazia?
	 * Resposta: Sim
	 * Validado no teste:
	 * testEmptyAgain ()   
	 * */		
	@Test
	public void testEmptyAgain () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.pop());
		assertEquals(true, myStack.isEmpty());
		assertEquals(-1, myStack.peek());
	}
	
	/*A função peek (verifica o valor no topo da pilha) funciona corretamente depois de ter
removido algum elemento?
	 * Resposta: Sim
	 * Validado no teste:
	 *  testPeekAfterRemove ()   
	 * */
	@Test
	public void testPeekAfterRemove () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.peek());
	}
	
	/*O que acontece se são adicionados mais elementos do que o tamanho inicial da pilha?
		 * Resposta: O array fica descarta os elementos fora do tamanho inicial, 
		 * como se tem só dez elementos então o elemento 11 é descartado
		 * Validado no teste:
		 *  testOverflow ()   
		 * */
		@Test
		public void testOverflow () {
			StackArray myStack = new StackArray();
			int[] x = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11};
			for(int i = 0; i < x.length; i++) {
				myStack.push(x[i]);
				assertEquals(i + 1, myStack.size());
				assertEquals(x[i], myStack.peek());
				}
	}
		
		/*O que acontece se são removidos mais elementos do que foram adicionados?
		 * Resposta: Tem uma exeção de OutOfBounds
		 * Validado no teste:
		 *  testUnderflow ()   
		 * */
		@Test
		public void testUnderflow () {
			StackArray myStack = new StackArray();
			int[] x = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
			for(int i = 0; i < x.length; i++) {
				myStack.push(x[i]);
				assertEquals(i + 1, myStack.size());
				assertEquals(x[i], myStack.peek());
				}
			for(int i = x.length - 1; i >= 0; i--) {
				assertEquals(x[i], myStack.pop());
				}
				assertEquals(true, myStack.isEmpty());
				assertEquals(0, myStack.pop());
	}
		
}
