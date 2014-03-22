package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class App04_2_Test {
  @Test
  public void testAnagrams() {
    assertTrue(App04_2.isAnagram("Siobhan Donaghy", "Shanghai Nobody"));
    assertTrue(App04_2.isAnagram("Vladimir Nabokov", "Dorian Vivalkomb"));
  }
  
  @Test
  public void testNonAnagrams() {
    assertFalse(App04_2.isAnagram("shamim ahmed", "crocodile tears"));
  }
}
