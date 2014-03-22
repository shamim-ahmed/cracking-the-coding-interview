package edu.buet.cse.ch01;

/**
 *
 * @author shamim
 */
public class App05_1 {
  public static void main(String... args) {
    String input = "this is a test";
    System.out.println(replaceSpace(input));
  }
  
  private static String replaceSpace(String input) {
    if (input == null) {
      return null;
    }
    
    StringBuilder resultBuilder = new StringBuilder();
    char[] inputChars = input.toCharArray();
    
    for (char c : inputChars) {
      if (c == ' ') {
        resultBuilder.append("%20");
      } else {
        resultBuilder.append(c);
      }
    }
    
    return resultBuilder.toString();
  }
}
