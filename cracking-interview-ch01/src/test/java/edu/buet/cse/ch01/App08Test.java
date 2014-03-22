package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class App08Test {
  @Test
  public void testRotation() {
    assertTrue(App08.isRotationOf("pleap", "apple"));
  }
}
