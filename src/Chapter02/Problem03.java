package Chapter02;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 */
public class Problem03 {
  public static boolean deleteMiddleNode(Node n) {
    if (n == null || n.next == null) {
      return false;
    }
    Node next = n.next;
    n.data = next.data;
    n.next = n.next.next;
    return true;
  }

}
