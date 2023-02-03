public class BST {
  Node root;
  public void addNode(int val) {
    Node newNode = new Node(val);
    if (root == null) {
      root = new Node(val);
    } else {
      Node cur = root;
      Node parent = null;
      while (true) {
        parent = cur;
        if (val < cur.val) {
          parent.left = newNode;
          if (cur == null) {
            
          }
        }
      }
    }
  }
  public static void main(String[] args) {

  }
}

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
  }
}