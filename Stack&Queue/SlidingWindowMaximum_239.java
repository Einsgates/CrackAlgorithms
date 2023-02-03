
import java.util.Deque;
import java.util.LinkedList;

/**
 * Build a monotonic queue and each time add the element,
 * if the element is larger than the last added element, remove that element
 * Don't forget to check if the stack is empty
 */
class MyQueue {
  Deque<Integer> queue;

  public MyQueue() {
    queue = new LinkedList<>();
  }

  void pop(int val) {
    if (!queue.isEmpty() && queue.peek() == val) {
      queue.poll();
    }
  }

  void add(int val) {
    while (!queue.isEmpty() && val > queue.getLast()) {
      queue.removeLast();
    }
    queue.add(val);
  }

  int peek() {
    return queue.peek();
  }
}

public class SlidingWindowMaximum_239 {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums.length == 1) {
      return nums;
    }
    MyQueue queue = new MyQueue();
    int[] res = new int[nums.length - k + 1];
    for (int i = 0; i < k; i++) {
      queue.add(nums[i]);
    }
    res[0] = queue.peek();

    for (int i = 1; i < nums.length - k + 1; i++) {
      queue.pop(nums[i - 1]);
      queue.add(nums[k + i - 1]);
      res[i] = queue.peek();
    }
    printArray(res);
    return res;
  }

  void printArray(int[] nums) {
    for (int e : nums) {
      System.out.print(e);
      System.out.print(' ');
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
    int k = 3;
    SlidingWindowMaximum_239 myclass = new SlidingWindowMaximum_239();
    myclass.maxSlidingWindow(nums, k);
  }
}

// {10,3,4,1,2}, k = 3
// res = {10,4,4}
// nums[i+k-1]=nums[1+3-1]