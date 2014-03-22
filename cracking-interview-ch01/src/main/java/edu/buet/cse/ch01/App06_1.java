package edu.buet.cse.ch01;

import java.util.Random;

/**
 *
 * @author shamim
 */
public class App06_1 {
  private static final int MAX = 100;
  private static final int DIMENSION = 7;
  
  public static void main(String... args) {
    int[][] values = new int[DIMENSION][DIMENSION];
    Random randomGenerator = new Random();
    
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        values[i][j] = randomGenerator.nextInt(MAX) + 1;
      }
    }
    
    int[][] result = rotate(values);
    
    System.out.printf("Original array: %n%n");
    print(values);
    
    System.out.printf("%n%nRotated array: %n%n");
    print(result);
  }
  
  // this algorithm is not efficient in terms of space
  // but it does its job
  public static int[][] rotate(int[][] values) {
    if (values == null || values.length == 0) {
      return values;
    }
    
    final int m = values.length;
    final int n = values[0].length;
    
    if (m != n) {
      throw new IllegalArgumentException("input array dimensions must be equal");
    }
    
    int[][] result = new int[n][n];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int p = n - j - 1;
        int q = i;
        result[p][q] = values[i][j];
      } 
    }
    
    return result;
  }
  
  private static void print(int[][] values) {
    for (int[] a : values) {
      for (int n : a) {
        System.out.printf("%4d", n);
      }
      
      System.out.println();
    }
  }
}
