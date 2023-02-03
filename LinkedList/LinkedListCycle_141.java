public class LinkedListCycle_141 {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode fast = head.next, slow = head;
    while (fast != slow) {
      fast = (fast != null && fast.next != null) ? fast.next.next : null;
      slow = slow != null ? slow.next : null;
    }
    return fast == null ? false : true;
  }
}
