/*
There are two cases: mid in the left part or mid in the right part
eg.4 5 6 7 8 9 1 2
7 8 1 2 3 4 5 6
And then discuss the position of target
Be careful for edge case and when to choose what equality */
public class SearchInRotatedSortedArray_33 {
  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] >= nums[left]) {
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target > nums[mid] && target < nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 1 };
    SearchInRotatedSortedArray_33 myclass = new SearchInRotatedSortedArray_33();
    System.out.println(myclass.search(nums, 1));
  }
}
