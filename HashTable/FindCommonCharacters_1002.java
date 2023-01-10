import java.util.ArrayList;
import java.util.List;

/**
 * Calculate each word's letters' frequency
 * And get the minimum of all letters
 */
public class FindCommonCharacters_1002 {
  public List<String> commonChars(String[] words) {
    List<String> res = new ArrayList<>();
    int n = words.length;
    int[][] freq = new int[n][26];
    for (int j = 0; j < n; j++) {
      String s = words[j];
      for (int i = 0; i < s.length(); i++) {
        freq[j][s.charAt(i) - 'a']++;
      }
    }
    // System.out.println("freq arr:");
    // print2dArray(freq);
    // System.out.println();
    int[] arr = new int[26];
    for (int j = 0; j < 26; j++) {
      arr[j] = freq[0][j];
    }
    // printArray(arr);
    for (int j = 0; j < 26; j++) {
      for (int i = 0; i < n; i++) {
        arr[j] = Math.min(arr[j], freq[i][j]);
      }
    }
    // System.out.println("Array:");
    // printArray(arr);
    for (int i = 0; i < 26; i++) {
      while (arr[i] > 0) {
        res.add(String.valueOf((char) (i + 'a')));
        arr[i]--;
      }
    }
    return res;
  }

  void printArray(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
      System.out.print(' ');
    }
  }

  void print2dArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
        System.out.print(' ');
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    String[] words = { "cool", "lock", "cook" };
    FindCommonCharacters_1002 myclass = new FindCommonCharacters_1002();
    System.out.println(myclass.commonChars(words));
  }
}
