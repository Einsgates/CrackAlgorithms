/* From left to right, up to down, right to left, down to up
 * just simulate this process and track how it fill the array.
 * Draw the matrix and fill them in a roll
 */

public class Spiral_MatrixII_59 {
  public int[][] generateMatrix(int n) {
    int[][] arr = new int[n][n];
    int k = 1;
    int loop = 0;
    int i, j;
    if (n % 2 == 1)
      arr[n / 2][n / 2] = n * n;
    while (loop < n / 2) {
      for (j = loop; j < n - 1 - loop; j++) {
        arr[loop][j] = k++;
      }
      for (i = loop; i < n - 1 - loop; i++) {
        arr[i][n - 1 - loop] = k++;
      }
      for (j = n - 1 - loop; j > loop; j--) {
        arr[n - 1 - loop][j] = k++;
      }
      for (i = n - 1 - loop; i > loop; i--) {
        arr[i][loop] = k++;
      }
      loop++;
    }
    return arr;
  }

  // Here is another method, which is more versatile, works fine in mxn matrix
  // the idea is to track and mark visited, a small trick is used cuz res is
  // initialized to 0s.
  int[][] generateMatrix2(int n) {
    int i = 0, j = 0;
    // boolean[][] visited = new boolean[n][n];
    int cnt = 1;
    int[][] res = new int[n][n];
    while (cnt <= n * n) {
      while (j < n && res[i][j] == 0) {
        res[i][j] = cnt;
        cnt++;
        j++;
      }
      j--;
      i++;
      while (i < n && res[i][j] == 0) {
        res[i][j] = cnt;
        cnt++;
        i++;
      }
      i--;
      j--;
      while (j >= 0 && res[i][j] == 0) {
        res[i][j] = cnt;
        cnt++;
        j--;
      }
      j++;
      i--;
      while (i >= 0 && res[i][j] == 0) {
        res[i][j] = cnt;
        cnt++;
        i--;
      }
      i++;
      j++;
    }
    return res;
  }

  void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
        System.out.print(' ');
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    Spiral_MatrixII_59 myclass = new Spiral_MatrixII_59();
    int[][] arr = myclass.generateMatrix2(n);
    myclass.printArray(arr);
  }
}
