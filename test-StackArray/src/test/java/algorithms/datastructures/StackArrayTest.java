package algorithms.datastructures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StackArrayTest {
	
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
	
	@Test
	public void testPopPush () {
		StackArray myStack = new StackArray();
		myStack.push(5);
		int dado = myStack.pop();
		boolean valid = (dado == 5);
		assertTrue(valid); 		
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

	@Test
	public void testLastArrayItem() {
		StackArray stackArray = new StackArray();
		stackArray.push(9);
		stackArray.push(10);
		assertEquals(10, stackArray.peek());
	}
}
