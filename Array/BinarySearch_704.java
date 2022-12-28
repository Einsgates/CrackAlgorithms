public class BinarySearch_704 {
  public static int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      int midval = nums[mid];
      if (midval < target) {
        left = mid + 1;
      } else if (midval > target) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 0, 3, 5, 9, 12 };
    int target = 2;
    System.out.println(search(nums, target));
  }
}
