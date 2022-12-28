/**
 * Double pointer(fast & slow pointer), first pointer is used to iterate through the array
 * second pointer is used fill the content of the array
 */
public class RemoveElement_27 {
  public int removeElement(int[] nums, int val) {
    int i = 0, j = 0;
    int cnt = nums.length;
    while (j < nums.length && i < nums.length) {
      if (nums[i] != val) {
        nums[j++] = nums[i++];
      } else {
        i++;
        cnt--;
      }
    }
    return cnt;
  }
  void printArray(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    RemoveElement_27 myclass = new RemoveElement_27();
    // myclass.printArray(nums);
    myclass.removeElement(nums, val);
    myclass.printArray(nums);
  }
}
