package edu.buet.cse.ch02;

import java.util.Iterator;

/**
 * @param <E>
 * @author shamim
 */
public class SinglyLinkedList<E> implements Iterable<E> {

  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SinglyLinkedList() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int getSize() {
    return size;
  }

  public void addFirst(E item) {
    Node<E> node = new Node<>(item);

    if ((isEmpty())) {
      tail = node;
    } else {
      node.setNext(head);
    }

    head = node;
    size++;
  }

  public void addLast(E item) {
    Node<E> node = new Node<>(item);

    if (isEmpty()) {
      head = node;
    } else {
      tail.setNext(node);
    }

    tail = node;
    size++;
  }

  public E removeFirst() {
    if (isEmpty()) {
      throw new RuntimeException("list is empty");
    }

    Node<E> node = head;
    head = head.getNext();
    size--;

    if (isEmpty()) {
      tail = head;
    }

    node.setNext(null);
    return node.getItem();
  }

  public E removeLast() {
    if (isEmpty()) {
      throw new RuntimeException("list is empty");
    }

    E item;

    if (size == 1) {
      item = tail.getItem();
      size--;
      head = tail = null;
    } else {
      Node<E> current = head;

      while (current.getNext() != tail) {
        current = current.getNext();
      }

      item = tail.getItem();
      current.setNext(null);
      tail = current;
      size--;
    }

    return item;
  }

  public Node<E> deleteNode(E item) {
    if (isEmpty()) {
      throw new RuntimeException("list is empty");
    }

    Node<E> node;

    if (head.getItem().equals(item)) {
      node = head;
      head = head.getNext();
    } else {
      Node<E> p = head;
      Node<E> q;

      while ((q = p.getNext()) != null && !q.getItem().equals(item)) {
        p = q;
      }

      if (q != null) {
        p.setNext(q.getNext());
      }

      node = q;
    }

    if (node != null) {
      size--;
      node.setNext(null);
    }

    return node;
  }

  @Override
  public Iterator<E> iterator() {
    return new CustomIterator();
  }

  private class CustomIterator implements Iterator<E> {

    private Node<E> currentNode = null;
    private boolean atStart = true;

    @Override
    public boolean hasNext() {
      if (size == 0) {
        return false;
      }
      
      if (atStart) {
        return true;
      }

      return currentNode.getNext() != null;
    }

    @Override
    public E next() {  
      Node<E> node;
      
      if (atStart) {
        node = head;
        atStart = false;
      } else {
        node = currentNode.getNext();
      }
     
      if (node == null) {
        throw new RuntimeException("no next item");
      }
      
      currentNode = node;
      return node.getItem();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException("Not supported yet.");
    }
  }
}
