import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum_15 {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> uniqueSet = new HashSet<>();
    Arrays.sort(nums);
    // if (nums[0] > 0 && target < 0)
    //   return res;
    for (int i = 0; i < nums.length - 3; i++) {
      for (int j = i + 1; j < nums.length - 2; j++) {
        int left = j + 1, right = nums.length - 1;
        while (left < right) {
          long sum = nums[i] + nums[j] + nums[left] + nums[right];
          if (sum < target) {
            left++;
          } else if (sum > target) {
            right--;
          } else {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(nums[left]);
            temp.add(nums[right]);
            uniqueSet.add(temp);
            left++;
            right--;
          }
        }
      }
    }
    for (List list : uniqueSet) {
      res.add(list);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
    int target = -294967296;
    FourSum_15 myclass = new FourSum_15();
    System.out.println(myclass.fourSum(nums, target));
  }
}
