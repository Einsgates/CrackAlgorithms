# 数组总结
## 1. 双指针
Double pointer, one from leftmost, one from rightmost and get close to each other. $O(n)$
## 2. 二分法
Binary Search, $O(logn)$, the prototype is like
```
// Assume array is in ascending order, find index of target
int binarySearch(int[] nums, int target) {
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
  return -1;
}
```
## 3. 滑动窗口
Two pointers i, j, from beginning, and move to the rightmost, i <= j and keep track of the items between i and j. When some conditions are satisfied, compare and update what you need.  
## 4. 模拟
Just simulate what this process is, sometimes use a visited array is helpful