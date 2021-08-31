package Chapter04;

/**
 *  Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an
 *  algorithm to create a binary search tree with minimal height.
 */
public class Problem02 {
  public BSTnode minimalTree(Integer[] elems) {
    return minimalTree(elems, 0, elems.length - 1);
  }

  public BSTnode minimalTree(Integer[] elems, int start, int end) {
    if (end < start) {
      return null;
    }

    int mid = (start + end) / 2;
    BSTnode n = new BSTnode();
    n.value = elems[mid];
    n.left = minimalTree(elems, start, mid - 1);
    n.right = minimalTree(elems, mid + 1, end);
    return n;
  }

}
