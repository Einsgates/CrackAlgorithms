public class DesignLinkedList_707 {
  int size;
  ListNode head;

  public DesignLinkedList_707() {
    size = 0;
    head = new ListNode(0);
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    ListNode cur = head;
    for (int i = 0; i <= index; i++) {
      cur = cur.next;
    }
    return cur.val;
  }

  public void addAtHead(int val) {
    addAtHead(val);
  }

  public void addAtTail(int val) {
    addAtIndex(0, size);
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }
    ListNode newNode = new ListNode(val);
    ListNode cur = head;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    newNode.next = cur.next;
    cur.next = newNode;
    size++;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    ListNode cur = head;
    for (int i = 0; i < index; i++) {
      cur = cur.next;
    }
    cur.next = cur.next.next;
    size--;
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
    DesignLinkedList_707 myLinkedList = new DesignLinkedList_707();
    myLinkedList.addAtHead(0);
    myLinkedList.addAtTail(1);
    myLinkedList.addAtIndex(10, 1);

  }
}
