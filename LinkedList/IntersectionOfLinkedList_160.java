/**
 * two pointers and jump to each other
 * when no intersection, they are all null
 * so the condition is node == null, not node.next == null!
 */
public class IntersectionOfLinkedList_160 {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode nodeA = headA, nodeB = headB;
    while (nodeA != nodeB) {
      nodeA = nodeA == null ? headB : nodeA.next;
      nodeB = nodeB == null ? headA : nodeB.next;
    }
    return nodeA;
  }
}
