public class LinkedListCycleII_142 {
  public ListNode detectCycle(ListNode head) {
    if (!hasCycle(head)) {
      return null;
    }
    ListNode fast = head.next.next, slow = head;
    while (fast != slow) {
      fast = fast.next.next;
      slow = slow.next;
    }
    slow = head;
    while (fast != slow) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }
  boolean hasCycle(ListNode head) {
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
