package edu.buet.cse.ch01;

import java.util.Arrays;

/**
 * 1.4 Decide if two strings are anagram or not
 *
 * @author shamim
 */
public class App04_1 {

  public static void main(String... args) {
    String input1 = "Vladimir Nabokov";
    String input2 = "Vivian Darkbloom";
    System.out.println(isAnagram(input1, input2));
  }

  public static boolean isAnagram(String firstStr, String secondStr) {
    if (firstStr == null || secondStr == null) {
      throw new IllegalArgumentException("argument cannot be null");
    }
    
    if (firstStr.length() != secondStr.length()) {
      return false;
    }

    char[] firstBuffer = firstStr.toLowerCase().toCharArray();
    char[] secondBuffer = secondStr.toLowerCase().toCharArray();

    Arrays.sort(firstBuffer);
    Arrays.sort(secondBuffer);

    boolean result = true;

    for (int i = 0, n = firstBuffer.length; i < n; i++) {
      if (firstBuffer[i] != secondBuffer[i]) {
        result = false;
        break;
      }
    }

    return result;
  }
}
