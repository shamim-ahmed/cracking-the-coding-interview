/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.buet.cse.ch01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shamim
 */
public class App01Test {
  @Test
  public void testWithInput() {
    assertTrue(App01.isComposedOfUniqueCharacters("any ide"));
    assertFalse(App01.isComposedOfUniqueCharacters("shamim ahmed"));
  }
}
