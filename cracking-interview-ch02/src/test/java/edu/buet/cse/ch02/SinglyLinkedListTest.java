package edu.buet.cse.ch02;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class SinglyLinkedListTest {

  @Test
  public void testAddFirstAndRemoveFirst() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    assertTrue(values.isEmpty());

    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addFirst(i);
    }

    assertFalse(values.isEmpty());
    assertEquals(n, values.getSize());

    for (int i = n; i >= 1; i--) {
      assertEquals(Integer.valueOf(i), values.removeFirst());
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testAddFirstAndRemoveLast() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addFirst(i);
    }

    assertFalse(values.isEmpty());
    assertEquals(n, values.getSize());

    for (int i = 1; i <= n; i++) {
      assertEquals(Integer.valueOf(i), values.removeLast());
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testAddLastAndRemoveFirst() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    assertTrue(values.isEmpty());
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addLast(i);
    }

    assertFalse(values.isEmpty());
    assertEquals(n, values.getSize());

    for (int i = 1; i <= n; i++) {
      assertEquals(Integer.valueOf(i), values.removeFirst());
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testAddLastAndRemoveLast() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    assertTrue(values.isEmpty());
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addLast(i);
    }

    assertFalse(values.isEmpty());
    assertEquals(n, values.getSize());

    for (int i = n; i >= 1; i--) {
      assertEquals(Integer.valueOf(i), values.removeLast());
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testEmptyList() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    assertTrue(values.isEmpty());

    try {
      values.removeFirst();
      assertTrue(false);
    } catch (RuntimeException ex) {
      assertTrue(true);
    }

    try {
      values.removeLast();
      assertTrue(false);
    } catch (RuntimeException ex) {
      assertTrue(true);
    }
  }

  @Test
  public void testDeleteNode() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addLast(i);
    }

    Node<Integer> node1 = values.deleteNode(5);
    assertNotNull(node1);
    assertEquals(Integer.valueOf(5), node1.getItem());

    Node<Integer> node2 = values.deleteNode(20);
    assertNull(node2);

    assertEquals(n - 1, values.getSize());

    for (int i = 1; i <= n; i++) {
      if (i != 5) {
        assertEquals(Integer.valueOf(i), values.removeFirst());
      }
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testDeleteFirstAndLast() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addLast(i);
    }

    Node<Integer> node1 = values.deleteNode(1);
    assertNotNull(node1);
    assertEquals(Integer.valueOf(1), node1.getItem());

    Node<Integer> node2 = values.deleteNode(n);
    assertNotNull(node2);
    assertEquals(Integer.valueOf(n), node2.getItem());

    assertEquals(n - 2, values.getSize());

    for (int i = 2; i <= n - 1; i++) {
      assertEquals(Integer.valueOf(i), values.removeFirst());
    }

    assertTrue(values.isEmpty());
  }

  @Test
  public void testIterator() {
    SinglyLinkedList<Integer> values = new SinglyLinkedList<>();
    final int n = 10;

    for (int i = 1; i <= n; i++) {
      values.addLast(i);
    }

    assertEquals(n, values.getSize());

    Iterator<Integer> iter = values.iterator();
    int p = 1;

    while (iter.hasNext()) {
      assertEquals(Integer.valueOf(p), iter.next());
      p++;
    }

    assertEquals(n, values.getSize());
    
    try {
      iter.next();
      assertTrue(false);
    } catch (RuntimeException ex) {
      assertTrue(true);
    }
  }
}
