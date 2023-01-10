import java.util.HashSet;
import java.util.Set;

/**
 * You can use similiar method of P.1002
 * Hashset is also a smart way
 */
public class IntersectionOfTwoArrays_349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    boolean[] appear1 = new boolean[1001];
    boolean[] appear2 = new boolean[1001];
    for (int i = 0; i < nums1.length; i++) {
      appear1[nums1[i]] = true;
    }
    for (int i = 0; i < nums2.length; i++) {
      appear2[nums2[i]] = true;
    }
    int n = 0;
    for (int i = 0; i < 1001; i++) {
      appear1[i] &= appear2[i];
      if (appear1[i]) {
        n++;
      }
    }
    int[] res = new int[n];
    int cnt = 0;
    for (int i = 0; i < 1001; i++) {
      if (appear1[i]) {
        res[cnt] = i;
        cnt++;
      }
    }
    // printArray(res);
    return res;
  }

  void printArray(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
      System.out.print(' ');
    }
  }

  int[] intersection2(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for (int e : nums1) {
      set1.add(e);
    }
    for (int e : nums2) {
      if (set1.contains(e)) {
        set2.add(e);
      }
    }
    return set2.stream().mapToInt(x -> x).toArray();
  }

  public static void main(String[] args) {
    int[] nums1 = { 4, 9, 5 };
    int[] nums2 = { 9, 4, 9, 8, 4 };
    IntersectionOfTwoArrays_349 myclass = new IntersectionOfTwoArrays_349();
    System.out.println(myclass.intersection2(nums1, nums2));
  }
}
