package Chapter04;

/**
 * Successor: Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a
 * binary search tree. You may assume that each node has a link to its parent.
 */
public class Problem06 {
  public BSTnode inOrderSucc(BSTnode n) {
    if (n == null) return null;
    if (n.right != null) {
      return leftMostChild(n.right);
    } else {
      /*
      BSTnode q = n;
      BSTnode x = q.parent;
      while (x != null && x.left != q) {
        q = x;
        x = x.parent;
      }
      return x;
       */
    }
    return null; //-----------------------------remove---------------------------
  }

  private BSTnode leftMostChild(BSTnode n) {
    if (n == null) return null;
    while (n.left != null) {
      n = n.left;
    }
    return n;
  }

}
