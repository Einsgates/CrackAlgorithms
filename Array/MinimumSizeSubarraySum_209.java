/**
 * Sliding window, using two pointers i, j
 * i is the left side and j is the right side, we only calculate values between them
 */

public class MinimumSizeSubarraySum_209 {
  public int minSubArrayLen(int target, int[] nums) {
    int sum = 0;
    int minLen = nums.length;
    int i = 0;
    //! use j to iterate, every iteration add nums[j]
    for (int j = 0; j < nums.length; j++) {
      sum += nums[j];
      while (sum >= target) {
        // as long as sum >= target, calculate the minLen 
        minLen = Math.min(minLen, j - i + 1);
        // and then subtract numss[i] from sum
        sum -= nums[i];
        // then increase i by 1
        i++;
      }
    }
    return minLen;
  }
  

  public static void main(String[] args) {
    MinimumSizeSubarraySum_209 myclass = new MinimumSizeSubarraySum_209();
    int target = 7;
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    System.out.println(myclass.minSubArrayLen(target, nums));
  }
}
