import java.util.*;

public class BinaryTreeRightSideView_199 {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        //! This code is important!
        if (i == size - 1) {
          res.add(node.val);
        }
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    TreeNode node4 = new TreeNode(4);
    TreeNode node5 = new TreeNode(5);
    root.left = node2;
    root.right = node3;
    node2.right = node5;
    node3.right = node4;
    BinaryTreeRightSideView_199 myclass = new BinaryTreeRightSideView_199();
    System.out.println(myclass.rightSideView(root));
  }
}
