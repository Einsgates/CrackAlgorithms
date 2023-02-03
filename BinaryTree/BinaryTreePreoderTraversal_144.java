import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreoderTraversal_144 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    preorder(root, res);
    return res;
  }

  void preorder(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    preorder(root.left, res);
    preorder(root.right, res);
  }

  public List<Integer> preorderTraversal1(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) {
      return res;
    }
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      res.add(node.val);
      if (node.right != null) {
        stack.add(node.right);
      }
      if (node.left != null) {
        stack.add(node.left);
      }
    }
    return res;
  }

  public List<Integer> preorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    if (root == null) {
      return res;
    }
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.peek();
      if (node != null) {
        stack.pop();
        if (node.right != null) stack.push(node.right);
        if (node.left!= null) stack.push(node.left);
        stack.push(node);
        stack.push(null);
      } else {
        stack.pop();
        node = stack.peek();
        stack.pop();
        res.add(node.val);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode leaf1 = new TreeNode(2);
    TreeNode leaf2 = new TreeNode(3);
    root.left = leaf1;
    root.right = leaf2;
    BinaryTreePreoderTraversal_144 myclass = new BinaryTreePreoderTraversal_144();
    System.out.println(myclass.preorderTraversal1(root));
  }
}
