package edu.buet.cse.ch01;

/**
 *
 * @author shamim
 */
public class App05_2 {
  public static void main(String... args) {
    String input = "This is a test";
    System.out.println(replaceSpace(input));
  }
  
  private static String replaceSpace(String input) {
    if (input == null) {
      return null;
    }
    
    char[] inputChars = input.toCharArray();
    int count = 0;
    
    for (char c : inputChars) {
      if (c == ' ') {
        count++;
      }
    }
    
    char[] outputChars = new char[inputChars.length + 2 * count];
    int index = 0;
    
    for (int k = 0; k < inputChars.length; k++) {
      char c = inputChars[k];
      
      if (c == ' ') {
        outputChars[index++] = '%';
        outputChars[index++] = '2';
        outputChars[index++] = '0';
      } else {
        outputChars[index++] = c;
      }
    }
    
    return String.valueOf(outputChars);
  }
}
