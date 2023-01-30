import java.util.ArrayList;
import java.util.List;

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

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode leaf1 = new TreeNode(2);
    TreeNode leaf2 = new TreeNode(3);
    root.left = leaf1;
    root.right = leaf2;
    BinaryTreePreoderTraversal_144 myclass = new BinaryTreePreoderTraversal_144();
    System.out.println(myclass.preorderTraversal(root));
  }
}
