/**
 * Use three pointers: prev, curr, succ to locate
 */
public class ReverseLinkedList_206 {
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode prev = null, curr = head, succ = head.next;
    while (curr != null) {
      curr.next = prev;
      prev = curr;
      curr = succ;
      if (succ != null) {
        succ = succ.next;
      } 
    }
    return prev;
  }
  public static void main(String[] args) {
    
  }
}
