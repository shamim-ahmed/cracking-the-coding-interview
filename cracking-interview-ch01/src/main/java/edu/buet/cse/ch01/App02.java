package edu.buet.cse.ch01;

/**
 * 1.2 Reverse a string
 * @author shamim
 */
public class App02 {
  public static void main(String... args) {
    System.out.println(reverse("this is a test"));
    System.out.println(reverse("shamima ahmed"));
  }
  
  public static String reverse(String input) {
    if (input == null) {
      return null;
    }
    
    char[] charArray = input.toCharArray();
    
    for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
      swap(charArray, i, j);
    }
    
    return String.valueOf(charArray);
  }
  
  private static void swap(char[] items, int i, int j) {
    char c = items[i];
    items[i] = items[j];
    items[j] = c;
  }
}
