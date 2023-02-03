import java.util.*;

public class FindLargestValueInEachTreeRow_515 {
  public List<Integer> largestValues(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> level = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        level.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      res.add(Collections.max(level));
    }
    return res;
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(8);
    list.add(4);
    list.add(10);
    list.add(6);
    System.out.println(Collections.max(list));
  }
}
