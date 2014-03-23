package edu.buet.cse.ch03.impl.ex;

/**
 *
 * @author shamim
 */
public class StackEmptyException extends RuntimeException {
  private static final long serialVersionUID = 1L;
  
  public StackEmptyException() {
    this("Stack is empty !");
  }
  public StackEmptyException(String message) {
    super(message);
  }
}
