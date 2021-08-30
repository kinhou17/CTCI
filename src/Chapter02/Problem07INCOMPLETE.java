package Chapter02;

/**
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect. Return the
 * intersecting node. Note that the intersection is defined based on reference, not value. That is,
 * if the kth node of the first linked list is the exact same node (by reference) as the jth node
 * of the second linked list, then they are intersecting.
 */
public class Problem07INCOMPLETE {

  // Run through each: get tails and length
  // Compare tails
  // Set two pointers to start of lls
  // On longer list, advance pointer by diff in lengths
  // travers each ll until pointers are the same


  public boolean intersection(Node n1, Node n2) {
    Node n1Reverse = reverseAndClone(n1);
    Node n2Reverse = reverseAndClone(n2);

    return false;
    }


  private Node reverseAndClone(Node n) {
    Node head = null;
    while (n != null) {
      Node currNode = new Node(n.data);
      currNode.next = head;
      head = currNode;
      n = n.next;
    }
    return head;
  }

}
