import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    inorder(root, res);
    return res;
  }

  void inorder(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    inorder(root.left, res);
    res.add(root.val);
    inorder(root.right, res);
  }

  public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (!stack.isEmpty() || cur != null) {
      if (cur != null) {
        stack.push(cur);
        cur = cur.left;
      } else {
        cur = stack.pop();
        res.add(cur.val);
        cur = cur.right;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    root.right = node2;
    node2.left = node3;
    BinaryTreeInorderTraversal_94 myclass = new BinaryTreeInorderTraversal_94();
    System.out.println(myclass.inorderTraversal(root));
  }
}
