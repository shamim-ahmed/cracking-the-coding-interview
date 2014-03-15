package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class App02Test {
  @Test
  public void testWithInput() {
    assertEquals("weivretni gnidoc eht gnikcarc", App02.reverse("cracking the coding interview"));
  }
}
