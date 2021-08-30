package Chapter02;

import java.util.HashMap;

/**
 Palindrome: Implement a function to check if a linked list is a palindrome.
 */
public class Problem06 {
  public boolean palindrome(Node n) {
    Node reverse = reverseAndClone(n);
    while (reverse.next != null) {
      if (reverse.data != n.data) {
        return false;
      }
      n = n.next;
      reverse = reverse.next;
    }
    return true;
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
