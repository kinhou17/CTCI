package Chapter02;

/**
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class Problem02 {
  public static int kthToLastElement(Node head, int k) {
    Node curr = head;
    Node runner = head;
    for (int i = 0; i < k; i++) {
      // if (runner == null) return null;
      runner = runner.next;
    }
    while (runner != null) {
      curr = curr.next;
      runner = runner.next;
    }
    return curr.data;
  }
}
