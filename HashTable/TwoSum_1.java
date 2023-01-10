import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      indexMap.put(nums[i], i);
    }
    for (int i = 0; i < nums.length - 1; i++) {
      if (indexMap.containsKey(target - nums[i]) && i != indexMap.get(target - nums[i])) {
        return new int[] { i, indexMap.get(target - nums[i]) };
      }
    }
    return new int[] { -1, -1 };
  }

  void printArray(int[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
      System.out.print(' ');
    }
  }

  public static void main(String[] args) {
    int[] nums = { 3,3 };
    int target = 6;
    TwoSum_1 myclass = new TwoSum_1();
    int[] res = myclass.twoSum(nums, target);
    myclass.printArray(res);
  }
}
