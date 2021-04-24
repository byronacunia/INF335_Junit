/* Nome / RG
** Byron Alejandro Acuña Acurio / G371370-U
** Juliana Cardoso Malton / 47.040.955-1
*/

package algorithms.datastructures;

import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;

import java.util.Arrays;

//import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.*;

public class StackArrayTest {

	/* O tamanho inicial da pilha � o esperado?
	 * Resposta: Sim
	 * Validado nos testes:
	 * testInitialSize()
	 * testValidisEmpty ()
	 * testIsNoEmpty ()
	 * */
	@Test
	public void testInitialSize() {
		StackArray myStack = new StackArray();
		int size = myStack.size();
		assertEquals(0, size);
	}

	@Test
	public void testArrayIsEmpty() {
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

	/* Os valores dos elementos retirados da pilha corresponde com aqueles que foram inseridos?
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

	/* Os elementos s�o retirados da pilha na ordem correta?
	 * Resposta: Sim
	 * Validado no teste:
	 *  testRemovalItemsOrder  ()
	 * */
	@Test
	public void testRemovalItemsOrder() {
		StackArray myStack = new StackArray();
		myStack.push(5);
		myStack.push(7);
		assertEquals(7, myStack.pop());
		assertEquals(5, myStack.pop());
	}

	@Test
	public void testCleanArray() {
		StackArray stackArray = new StackArray();
		int[] sample = {0, 1, 2};
		Arrays.stream(sample).forEach(stackArray::push);
		stackArray.makeEmpty();
		assertTrue(stackArray.isEmpty());
	}

	@Test
	public void testArrayIsFull() {
		StackArray stackArray = new StackArray();
		for(int i = 0; i < 10; i++) {
			stackArray.push(i);
		}
		assertTrue(stackArray.isFull());
	}

	/* A fun��o peek (verifica o valor no topo da pilha) funciona corretamente?
	 * Resposta: Sim
	 * Validado no teste:
	 *  testPeekItem ()
	 * */
	@Test
	public void testPeekItem() {
		StackArray stackArray = new StackArray();
		stackArray.push(9);
		stackArray.push(10);
		assertEquals(10, stackArray.peek());
	}

	/* A fun��o peek (verifica o valor no topo da pilha) funciona corretamente quando a pilha est�
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
		assertTrue(myStack.isEmpty());
		assertEquals(-1, myStack.peek());
	}

	/* A fun��o peek (verifica o valor no topo da pilha) funciona corretamente depois de ter
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

	/* O que acontece se s�o adicionados mais elementos do que o tamanho inicial da pilha?
	 * Resposta: O array fica descarta os elementos fora do tamanho inicial,
	 * como se tem s� dez elementos ent�o o elemento 11 � descartado
	 * Validado no teste:
	 *  testOverflow ()
	 * */
	@Test
	public void testOverflow() {
		StackArray myStack = new StackArray();
		int[] x = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10, 11};
		Arrays.stream(x).forEach(myStack::push);

		assertEquals(11, myStack.size());
	}

	/* O que acontece se s�o removidos mais elementos do que foram adicionados?
	 * Resposta: Tem uma exe��o de OutOfBounds ao tentar realizar o resize do vetor
	 * Validado no teste:
	 *  testUnderflow ()
	 * */
	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void testUnderflow () {
		StackArray myStack = new StackArray();
		int[] x = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
		Arrays.stream(x).forEach(myStack::push);

		for(int i = 0; i < x.length; i++) {
			myStack.pop();
		}

		assertTrue(myStack.isEmpty());
		myStack.pop();
	}
}
