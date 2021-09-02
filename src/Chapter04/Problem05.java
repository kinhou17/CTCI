package Chapter04;

/**
 * Validate BST: Implement a function to check if a binary tree is a binary search tree.
 */
public class Problem05 {
  public boolean validateBST(BSTnode root) {
    return validateBST(root, null, null);
  }

  private boolean validateBST(BSTnode n, Integer min, Integer max) {
    if (n == null) {
      return true;
    }

    if ((min != null && n.value <= min) || (max != null && n.value > max)) {
      return false;
    }

    if (!validateBST(n.left, min, n.value) || !validateBST(n.right, n.value, max)) {
      return false;
    }

    return true;
  }
}
