package edu.buet.cse.ch01;

/**
 *
 * @author shamim
 */
public class App07 {
  public static void main(String... args) {
    
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
}
