package Chapter02;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Remove Dups! Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Problem01 {
  public void removeDups(Node n) {
    HashSet<Integer> values = new HashSet<>();
    Node prev = null;
    while (n != null) {
      if (values.contains(n.data)) {
        prev.next = n.next;
      } else {
        values.add(n.data);
        prev = n;
      }
      n = n.next;
    }
  }

  // No buffer allowed
  public void removeDups2(Node n) {
    Node current = n;
    while (current != null) {
      Node runner  = current;
      while (runner != null) {
        if (runner.next.data == current.data) {
          runner.next = runner.next.next;
        } else {
          runner = runner.next;
        }
      }
      current = current.next;
    }
  }

}
