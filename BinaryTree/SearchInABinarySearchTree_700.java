public class SearchInABinarySearchTree_700 {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }
    TreeNode result = null;
    if (root.val < val) {
      result = searchBST(root.right, val);
    } else if (root.val > val) {
      result = searchBST(root.left, val);
    }
    return result;
  }

  public TreeNode searchBST2(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }
    while (root != null) {
      if (val < root.val) {
        root = root.left;
      } else if (val > root.val) {
        root = root.right;
      } else {
        return root;
      }
    }
    return null;
  }

  public static void main(String[] args) {

  }
}
