package Chapter04;

import java.util.LinkedList;

/**
 * List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
 * at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 */
public class Problem03 {
  public LinkedList<BSTnode>[] listOfDepths(BSTnode root) {
    int depth = depth(root);
    LinkedList<BSTnode>[] depthNodes = new LinkedList[depth];
    listOfDepths(depthNodes, root, 0);
    return depthNodes;
  }

  public void listOfDepths(LinkedList<BSTnode>[] depthNodes, BSTnode node, int depth) {
    if (node == null) return;
    depthNodes[depth].add(node);
    listOfDepths(depthNodes, node.left, depth + 1);
    listOfDepths(depthNodes, node.right, depth + 1);
  }

  private int depth(BSTnode root) {
    if (root == null) return 0;
    int leftHeight = depth(root.left);
    int rightHeight = depth(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
