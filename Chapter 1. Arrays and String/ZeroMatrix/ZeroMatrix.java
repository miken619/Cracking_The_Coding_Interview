/* Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0*/

public class ZeroMatrix {

  public int[][] zeroMatrix(int[][] matrix) {
    
    boolean hasZeroInRow = false, hasZeroInCol = false;
    int m = matrix.length, n = matrix[0].length;

    for(int i = 0; i < m; ++i) {
        if(matrix[i][0] == 0) {
            hasZeroInRow = true;
            break;
        }
    }

    for(int j = 0; j < n; ++j) {
        if(matrix[0][j] == 0) {
            hasZeroInCol = true;
            break;
        }
    }

    for(int i = 0; i < m; ++i) {
        for(int j = 0; j < n; ++j) {
            if(matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    for(int i = 0; i < m; ++i) {
        if(matrix[i][0] == 0) {
            nullifyRow(matrix, i, n);
        }
    }

    for(int j = 0; j < n; ++j) {
        if(matrix[0][j] == 0) {
            nullifyCol(matrix, j, m);
        }
    }

    if(hasZeroInRow) nullifyRow(matrix, 0, n);
    if(hasZeroInCol) nullifyCol(matrix, 0, m);



    
    return matrix;
  }

  public void nullifyRow(int[][] matrix, int idx, int n) {
     for(int j = 0; j < n; ++j) {
         matrix[idx][j] = 0;
     }
  }

  public void nullifyCol(int[][] matrix, int idx, int m) {
    for(int i = 0; i < m; ++i) {
        matrix[i][idx] = 0;
    }
 }
}