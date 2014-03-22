package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class AnagramDetector2Test {
  @Test
  public void testAnagrams() {
    assertTrue(AnagramDetector2.isAnagram("Siobhan Donaghy", "Shanghai Nobody"));
    assertTrue(AnagramDetector2.isAnagram("Vladimir Nabokov", "Dorian Vivalkomb"));
  }
  
  @Test
  public void testNonAnagrams() {
    assertFalse(AnagramDetector2.isAnagram("shamim ahmed", "crocodile tears"));
  }
}
