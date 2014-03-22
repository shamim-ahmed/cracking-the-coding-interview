package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class AnagramDetectorTest {
  @Test
  public void testAnagrams() {
    assertTrue(AnagramDetector.isAnagram("Siobhan Donaghy", "Shanghai Nobody"));
    assertTrue(AnagramDetector.isAnagram("Vladimir Nabokov", "Dorian Vivalkomb"));
  }
  
  @Test
  public void testNonAnagrams() {
    assertFalse(AnagramDetector.isAnagram("shamim ahmed", "crocodile tears"));
  }
}
