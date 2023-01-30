import java.util.ArrayList;
import java.util.List;

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

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    TreeNode node2 = new TreeNode(2);
    TreeNode node3 = new TreeNode(3);
    root.right = node2;
    node2.right = node3;
    BinaryTreePostorderTraversal_145 myclass = new BinaryTreePostorderTraversal_145();
    System.out.println(myclass.postorderTraversal(root));
  }
}
