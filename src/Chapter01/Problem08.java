package Chapter01;

/**
 * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */
public class Problem08 {
  public static void zeroMatrix(int[][] matrix) {
    boolean rows[] = new boolean[matrix.length];
    boolean cols[] = new boolean[matrix[0].length];

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; row < matrix[0].length; col++) {
        if (matrix[row][col] == 0) {
          rows[row] = true;
          cols[col] = true;
        }
      }
    }

    for (int i = 0; i < rows.length; i++) {
      if (rows[i] == true) {
        for (int j = 0; j < matrix[0].length; j++) {
          matrix[i][j] = 0;
        }
      }
    }
    for (int i = 0; i < cols.length; i++) {
      if (cols[i] == true) {
        for (int j = 0; j < matrix.length; j++) {
          matrix[j][i] = 0;
        }
      }
    }
  }
}
