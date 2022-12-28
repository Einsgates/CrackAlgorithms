import java.util.Arrays;

public class SquaresOfSortedArray_977 {
  // print array elements
  void printArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      System.out.print(' ');
    }
  }
  // Double pointer from left and right
  // Similiar to merge algorithms
  public int[] sortedSquares(int[] nums) {
    int[] arr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Math.abs(nums[i]);
    }
    int i = 0, j = nums.length - 1, k = nums.length - 1;
    while (i <= j) {
      if (nums[i] >= nums[j]) {
        arr[k] = nums[i] * nums[i];
        i++;
        k--;
      } else {
        arr[k] = nums[j] * nums[j];
        j--;
        k--;
      }
    }
    return arr;
  }
  public static void main(String[] args) {
    int[] nums = {-20,-19,-14,-12,-7,-5,2,2,4,6,6,7,8,9,10,12,17,17,18,18 };
    SquaresOfSortedArray_977 myclass = new SquaresOfSortedArray_977();
    int[] res = myclass.sortedSquares(nums);
    myclass.printArray(res);
  }
}
