import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15 {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> tempSet = new HashSet<>();
    int[] arr = nums.clone();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        int target = -(arr[i] + arr[j]);
        int left = j + 1, right = arr.length - 1;
        while (left <= right) {
          int mid = (left + right) / 2;
          if (arr[mid] < target) {
            left = mid + 1;
          } else if (arr[mid] > target) {
            right = mid - 1;
          } else {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            temp.add(arr[j]);
            temp.add(arr[mid]);
            tempSet.add(temp);
            break;
          }
        }
      }
    }
    for (List list : tempSet) {
      res.add(list);
    }
    return res;
  }

  public List<List<Integer>> threeSum2(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> tempSet = new HashSet<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      
      int left = i + 1, right = nums.length - 1;
      while (left < right) {
        if (nums[i] + nums[left] + nums[right] < 0) {
          left++;
        } else if (nums[i] + nums[left] + nums[right] > 0) {
          right--;
        } else {
          List<Integer> temp = new ArrayList<>();
          temp.add(nums[i]);
          temp.add(nums[left]);
          temp.add(nums[right]);
          tempSet.add(temp);
          // cannot break here, there might be another tuples such that nums[left]+nums[right]+nums[i]==0
          left++;
          right--;
        }
      }
    }
    for (List list : tempSet) {
      res.add(list);
    }
    return res;
  }

  void printArray(Integer[] arr) {
    for (int j = 0; j < arr.length; j++) {
      System.out.print(arr[j]);
      System.out.print(' ');
    }
  }

  public static void main(String[] args) {
    int[] nums = { -2, 0, 1, 1, 2 };

    ThreeSum_15 myclass = new ThreeSum_15();
    System.out.println(myclass.threeSum2(nums));
  }
}
