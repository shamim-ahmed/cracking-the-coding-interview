package edu.buet.cse.ch01;

/**
 * 1.1 Determine if a string is composed of unique characters
 * @author shamim
 */
public class App01 {
  private static final int ASCII_SET_SIZE = 256;
  
  public static void main(String[] args) {
    String input = "This is a test";
    boolean result = isComposedOfUniqueCharacters(input);
    System.out.println(result);
  }
  
  // we assume that all characters are from ASCII character set
  public static boolean isComposedOfUniqueCharacters(String input) {
    boolean result = true;
    boolean[] status = new boolean[ASCII_SET_SIZE];
    
    for (int i = 0, n = input.length(); i < n; i++) {
      char c = input.charAt(i);
      
      if (status[c]) {
        result = false;
        break;
      }
      
      status[c] = true;
    }
    
    return result;
  }
}
