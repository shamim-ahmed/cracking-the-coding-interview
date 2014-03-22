package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class App04_1_Test {
  @Test
  public void testAnagrams() {
    assertTrue(App04_1.isAnagram("Siobhan Donaghy", "Shanghai Nobody"));
    assertTrue(App04_1.isAnagram("Vladimir Nabokov", "Dorian Vivalkomb"));
  }
  
  @Test
  public void testNonAnagrams() {
    assertFalse(App04_1.isAnagram("shamim ahmed", "crocodile tears"));
  }
}
