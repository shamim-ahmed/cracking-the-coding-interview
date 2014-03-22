package edu.buet.cse.ch01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author shamim
 */
public class App08 {
  public static void main(String... args) {
    System.out.println(isRotationOf("pplea", "apple"));
  }
  
  public static boolean isRotationOf(String s, String t) {
    if (s == null || t == null) {
      throw new IllegalArgumentException("argument cannot be null");
    }
    
    if (s.length() != t.length()) {
      return false;
    }
    
    String q = s.concat(s);
    return isSubstring(t, q);
  }
  
  private static boolean isSubstring(String strToFind, String strToSearch) {
    Pattern p = Pattern.compile(strToFind);
    Matcher m = p.matcher(strToSearch);
    return m.find();
  }
}
