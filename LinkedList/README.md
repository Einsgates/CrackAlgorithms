# 链表总结
###1. 虚拟头节点dummy
```java
ListNode dummy = new ListNode(-1);
dummy.next = head;
```
###2. 设计链表
```java

// Definition for ListNode.
class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class MyLinkedList {
  int size;
  ListNode head;

  public MyLinkedList() {
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
}
```
### 3.反转链表
递归 or 迭代
Set three pointers, prev, curr, succ

### 4.删除倒数N个
two pointers, first one go n and then go together, when fast becomes null, slow one comes to last N

### 5. 环形链表
快慢指针、判断是否有环、环的位置
### Mind Map
![](mindmap.png)