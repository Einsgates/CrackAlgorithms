import java.util.*;

class Node {
  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int _val) {
      val = _val;
  }

  public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
  }
};

public class NaryTreeLevelOrderTraversal_429 {
  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> res = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    if (root != null) {
        queue.add(root);
    }
    while (!queue.isEmpty()) {
        int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Node node = queue.poll();
            level.add(node.val);
            for (Node child : node.children) {
                if (child != null) {
                    queue.add(child);
                }
            }
        }
        res.add(level);
    }
    return res;
}  
  public static void main(String[] args) {
    
  }
}
