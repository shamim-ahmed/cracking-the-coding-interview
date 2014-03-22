package edu.buet.cse.ch01;

/**
 *
 * @author shamim
 */
public class AnagramDetector2 {
  private static final int MAX = 256;
  
  public static void main(String... args) {
    String input1 = "Vladimir Nabokov";
    String input2 = "Vivian Darkbloom";
    System.out.println(isAnagram(input1, input2));
  }
  
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    
    int[] counters = new int[MAX];
    char[] s_chars = s.toLowerCase().toCharArray();
    int uniqueCharCount = 0;
    
    for (char c : s_chars) {
      if (counters[c] == 0) {
        uniqueCharCount++;
      }
      
      counters[c]++;
    }
    
    char[] t_chars = t.toLowerCase().toCharArray();
    int uniqueCharProcessed = 0;
    boolean result = false;
    
    for (int i = 0, n = t_chars.length; i < n; i++) {
      char c = t_chars[i];
      counters[c]--;
      
      if (counters[c] < 0) {
        break;
      } else if (counters[c] == 0) {
        uniqueCharProcessed++;
        
        if (uniqueCharProcessed == uniqueCharCount) {
          result = (i == n - 1);
          break;
        }
      }
    }
    
    return result;
  }
}
