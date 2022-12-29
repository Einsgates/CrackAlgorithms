import java.beans.Visibility;
import java.util.ArrayList;
import java.util.List;

/* Use a visited array to mark if visited, pretty smart!
Compare this with #59, the difference this is mxn array instead of a square */
public class SpiralMatrix_54 {
  public List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    List<Integer> res = new ArrayList<>();
    int i = 0, j = 0;
    boolean[][] visited = new boolean[m][n];
    while (res.size() < m * n) {
      while (j < n && !visited[i][j]) {
        res.add(matrix[i][j]);
        visited[i][j] = true;
        j++;
      }
      j--;
      i++;
      while (i < m && !visited[i][j]) {
        res.add(matrix[i][j]);
        visited[i][j] = true;
        i++;
      }
      i--;
      j--;
      while (j >= 0 && !visited[i][j]) {
        res.add(matrix[i][j]);
        visited[i][j] = true;
        j--;
      }
      j++;
      i--;
      while (i >= 0 && !visited[i][j]) {
        res.add(matrix[i][j]);
        visited[i][j] = true;
        i--;
      }
      i++;
      j++;
    }
    return res;
  }

  public static void main(String[] args) {
    int[][] matrix = new int[3][4];
    int k = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        matrix[i][j] = k++;
      }
    }
    SpiralMatrix_54 myclass = new SpiralMatrix_54();
    System.out.println(myclass.spiralOrder(matrix));
  }
}
