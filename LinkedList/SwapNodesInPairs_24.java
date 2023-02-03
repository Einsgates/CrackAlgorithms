/**
 * https://www.bilibili.com/video/BV1YT411g7br/
 * Use temp1 and temp2 to store nodes so that no broken chain
 * Dummy to avoid complicated operations
 * deal with pairs one by one and change the value
 * the above video is great, check it out!
 */
public class SwapNodesInPairs_24 {
  // iteration
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode cur = dummy;
    while (cur.next != null && cur.next.next != null) {
      ListNode temp1 = cur.next;
      ListNode temp2 = cur.next.next;
      cur.next = cur.next.next;
      cur.next.next = temp1;
      temp1.next = temp2;
      cur = cur.next.next;
    }
    return dummy.next;
  }
  // recursion
  public ListNode swapPairs2(ListNode head) {
    // base case 退出提交
    if(head == null || head.next == null) return head;
    // 获取当前节点的下一个节点
    ListNode next = head.next;
    // 进行递归
    ListNode newNode = swapPairs(next.next);
    // 这里进行交换
    next.next = head;
    head.next = newNode;

    return next;
}
  public static void main(String[] args) {

  }
}
