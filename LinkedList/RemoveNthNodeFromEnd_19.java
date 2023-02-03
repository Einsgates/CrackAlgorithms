/**
 * Use prev and cur pointers and operate on deletion
 */
public class RemoveNthNodeFromEnd_19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = 1;
    ListNode cur = head;
    while (cur.next != null) {
      size++;
      cur = cur.next;
    } 
    int pos = size - n;
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode prev = dummy;
    cur = head;
    for (int i = 0; i < pos; i++) {
      prev = prev.next;
      cur = cur.next;
    }
    prev.next = cur.next;
    return dummy.next;
  }
}
