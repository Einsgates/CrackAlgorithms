public class SearchInsertPosition_35 {
  public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] < target) {
        left = mid + 1;
      } else if (nums[mid] > target) {
        right = mid - 1;
      } else {
        return mid;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    int[] nums = {1,3,5,6};
    int target = 7;
    SearchInsertPosition_35 myclass = new SearchInsertPosition_35();
    System.out.println(myclass.searchInsert(nums, target));
  }
}
