package edu.buet.cse.ch03.impl;

import edu.buet.cse.ch03.impl.ex.StackEmptyException;
import edu.buet.cse.ch03.model.Stack;

/**
 * @param <E>
 * @author shamim
 */
public class LinkedStack<E> implements Stack<E> {
  private Node<E> head;
  private int size;
  
  public LinkedStack() {
    head = null;
    size = 0;
  }
  
  @Override
  public void push(E item) {
    Node<E> node = new Node<>(item);
    
    if (isEmpty()) {
      head = node;
    } else {
      node.setNext(head);
    }
    
    head = node;
    size++;
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }
    
    E item = head.getItem();
    head = head.getNext();
    size--;
    
    return item;
  }

  @Override
  public E top() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }
    
    return head.getItem();
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }
}
