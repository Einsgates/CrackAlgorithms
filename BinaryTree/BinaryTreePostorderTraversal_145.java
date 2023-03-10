import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    postorder(root, res);
    return res;
  }

  void postorder(TreeNode root, List<Integer> res) {
    if (root == null)
      return;
    postorder(root.left, res);
    postorder(root.right, res);
    res.add(root.val);
  }

  public List<Integer> postorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) {
      return res;
    }
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      res.add(node.val);
      if (node.left != null) {
        stack.add(node.left);
      }
      if (node.right != null) {
        stack.add(node.right);
      }
    }
    Collections.reverse(res);
    return res;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    root.right = node2;
    node2.right = node3;
    BinaryTreePostorderTraversal_145 myclass = new BinaryTreePostorderTraversal_145();
    System.out.println(myclass.postorderTraversal2(root));
  }
}
