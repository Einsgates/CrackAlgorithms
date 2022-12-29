/* First find when the target occurs, thenn find the leftmost and rightmost position.  */
public class FindFirstAndLastPosition_34 {
  public int[] searchRange(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        int leftmost = mid;
        int rightmost = mid;
        while (leftmost > 0 && nums[leftmost] == nums[leftmost - 1]) {
          leftmost--;
        }
        while (rightmost < nums.length - 1 && nums[rightmost] == nums[rightmost + 1]) {
          rightmost++;
        }
        return new int[] { leftmost, rightmost };
      }
    }
    return new int[] { -1, -1 };
  }

  void printArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      System.out.print(' ');
    }
  }

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    FindFirstAndLastPosition_34 myclass = new FindFirstAndLastPosition_34();
    int[] res = myclass.searchRange(nums, 8);
    myclass.printArray(res);
  }
}
