package edu.buet.cse.ch03.impl;

import edu.buet.cse.ch03.impl.ex.StackEmptyException;
import edu.buet.cse.ch03.model.Stack;

/**
 * @param <E>
 * @author shamim
 */
public class ArrayStack<E> implements Stack<E> {

  public static final int DEFAULT_INITIAL_CAPACITY = 10;
  private Object[] items;
  private int index;

  public ArrayStack() {
    this(DEFAULT_INITIAL_CAPACITY);
  }

  public ArrayStack(int initialCapacity) {
    if (initialCapacity <= 0) {
      throw new IllegalArgumentException("initial capacity must be positive");
    }

    items = new Object[initialCapacity];
    index = -1;
  }

  @Override
  public void push(E item) {
    ensureCapacity();
    items[++index] = item;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }

    E item = (E) items[index];
    items[index] = null;
    index--;

    return item;
  }

  @Override
  public E top() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }

    return (E) items[index];
  }

  @Override
  public int getSize() {
    return index + 1;
  }

  @Override
  public boolean isEmpty() {
    return getSize() == 0;
  }

  private void ensureCapacity() {
    if (index == items.length - 1) {
      Object[] newItems = new Object[2 * items.length + 1];
      System.arraycopy(items, 0, newItems, 0, items.length);
      items = newItems;
    }
  }
}
