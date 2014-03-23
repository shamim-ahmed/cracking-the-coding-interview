package edu.buet.cse.ch03.impl;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @param <E>
 * @author shamim
 */
class Node<E> {

  private E item;
  private Node<E> next;

  public Node() {
    this(null, null);
  }

  public Node(E item) {
    this(item, null);
  }

  public Node(E item, Node<E> next) {
    this.item = item;
    this.next = next;
  }

  public E getItem() {
    return item;
  }

  public void setItem(E item) {
    this.item = item;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
    builder.append("item", item);
    return builder.toString();
  }
}
