package Chapter04;

/**
 * Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
 * this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
 * node never differ by more than one.
 */
public class Problem04 {

  private int getHeight(BSTnode root) {
    if (root == null) return 0;
    int leftHeight = getHeight(root.left);
    int rightHeight = getHeight(root.right);
    return Math.max(leftHeight, rightHeight);
  }

  public boolean isBalanced(BSTnode root) {
    if (root == null) return true;
    int heightDif = Math.abs(getHeight(root.right) - getHeight(root.left));
    if (heightDif > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

}
