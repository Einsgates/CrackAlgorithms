import java.util.ArrayList;
import java.util.List;

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
