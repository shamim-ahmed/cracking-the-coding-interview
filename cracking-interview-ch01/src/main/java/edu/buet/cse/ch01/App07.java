package edu.buet.cse.ch01;

/**
 *
 * @author shamim
 */
public class App07 {
  public static void main(String... args) {
    int[][] values = new int[5][7];
    
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        values[i][j] = i + j + 1;
      }
    }
    
    values[1][2] = 0;
    values[3][4] = 0;
    
    resetRowsAndColumns(values);
    printValues(values);
  }
  
  public static void resetRowsAndColumns(int[][] values) {
    if (values == null || values.length == 0) {
      return;
    }
    
    final int m = values.length;
    final int n = values[0].length;
    boolean[] rowFlags = new boolean[m];
    boolean[] columnFlags = new boolean[n];
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (values[i][j] == 0) {
          rowFlags[i] = true;
          columnFlags[j] = true;
        }
      }
    }
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (rowFlags[i] || columnFlags[j]) {
          values[i][j] = 0;
        }
      }
    }
  }
  
  private static void printValues(int[][] values) {
    for (int[] a : values) {
      for (int n : a) {
        System.out.printf("%3d", n);
      }
      
      System.out.println();
    }
  }
}
