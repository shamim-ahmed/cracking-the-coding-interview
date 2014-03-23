package edu.buet.cse.ch03.model;

/**
 * @param <E>
 * @author shamim
 */
public interface Stack<E> {
  void push(E item);
  E pop();
  E top();
  int getSize();
  boolean isEmpty();
}
