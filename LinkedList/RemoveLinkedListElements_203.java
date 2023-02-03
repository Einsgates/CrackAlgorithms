/*
 * Use two pointer to track and set a dummy,
 * node between cur and pre is deleted
 */
public class RemoveLinkedListElements_203 {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode cur = head;
    ListNode pre = dummy;
    while (cur != null) {
      if (cur.val == val) {
        pre.next = cur.next;
        cur = cur.next;
      } else {
        cur = cur.next;
        pre = pre.next;
      }
    }
    return dummy.next;
  }

  void printList(ListNode head) {
    ListNode node = head;
    while (node != null) {
      System.out.print(node.val);
      System.out.print(' ');
      node = node.next;
    }
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(6);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    ListNode node6 = new ListNode(6);
    ListNode node7 = new ListNode(6);
    head.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    node6.next = node7;
    RemoveLinkedListElements_203 myclass = new RemoveLinkedListElements_203();
    myclass.removeElements(head, 6);
    myclass.printList(head);
  }
}