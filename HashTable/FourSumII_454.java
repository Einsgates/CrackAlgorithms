import java.util.HashMap;
import java.util.Map;
/**
 * Use one map to store the value of a+b
 * then iterate c+d and see if the hasmap contains -(c+d)
 * Using only O(n^2) compared to brute force O(n^4)
 */
public class FourSumII_454 {
  public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    Map<Integer, Integer> map = new HashMap<>();
    int cnt = 0;
    for (int a : nums1) {
      for (int b : nums2) {
        if (!map.containsKey(a + b)) {
          map.put(a + b, 1);
        } else {
          map.put(a + b, map.get(a + b) + 1);
        }
      }
    }
    for (int c : nums3) {
      for (int d : nums4) {
        int target = -(c+d);
        if (map.containsKey(target)) {
          cnt += map.get(target);
        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2 };
    int[] nums2 = { -2, -1 };
    int[] nums3 = { -1, 2 };
    int[] nums4 = { 0, 2 };
    FourSumII_454 myclass = new FourSumII_454();
    System.out.println(myclass.fourSumCount(nums1, nums2, nums3, nums4));
  }
}
