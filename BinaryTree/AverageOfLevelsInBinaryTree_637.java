import java.util.*;

public class AverageOfLevelsInBinaryTree_637 {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> res = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }
    while (!queue.isEmpty()) {
      int size = queue.size();
      double sum = 0;
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        sum += node.val;
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      res.add(sum / size);
    }
    return res;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    TreeNode node1 = new TreeNode(9);
    TreeNode node2 = new TreeNode(20);
    TreeNode node3 = new TreeNode(15);
    TreeNode node4 = new TreeNode(7);
    root.left = node1;
    root.right = node2;
    node2.left = node3;
    node2.right = node4;
    AverageOfLevelsInBinaryTree_637 myclass = new AverageOfLevelsInBinaryTree_637();
    System.out.println(myclass.averageOfLevels(root));
  }
}
