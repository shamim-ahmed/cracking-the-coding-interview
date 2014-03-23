package edu.buet.cse.ch03.impl;

import edu.buet.cse.ch03.impl.ex.StackEmptyException;
import edu.buet.cse.ch03.model.Stack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 * @author shamim
 */
public class LinkedStackTest {
  @Test
  public void testPushAndPop() {
    final int n = 13;
    Stack<Integer> stack = new LinkedStack<>();
    
    for (int i = 1; i <= n; i++) {
      stack.push(i);
    }
    
    assertFalse(stack.isEmpty());
    assertEquals(n, stack.getSize());
    
    for (int i = n; i >= 1; i--) {
      assertEquals(Integer.valueOf(i), stack.pop());
    }
    
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }
  
  @Test
  public void testTop() {
    final int n = 13;
    Stack<Integer> stack = new LinkedStack<>();
    
    for (int i = 1; i <= n; i++) {
      stack.push(i);
    }
    
    assertFalse(stack.isEmpty());
    assertEquals(n, stack.getSize());
    
    for (int i = n; i >= 1; i--) {
      assertEquals(Integer.valueOf(i), stack.top());
      assertEquals(i, stack.getSize());
      assertEquals(Integer.valueOf(i), stack.pop());
    }
    
    assertTrue(stack.isEmpty());
    assertEquals(0, stack.getSize());
  }
  
  @Test
  public void testEmptyStack() {
    Stack<Integer> stack = new LinkedStack<>();
    
    try {
      stack.pop();
      assertTrue(false);
    } catch (StackEmptyException ex) {
      assertTrue(true);
    }
  }
}
