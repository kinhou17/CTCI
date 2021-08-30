package Chapter02;

/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than x come
 * before all nodes greater than or equal to x. If x is contained within the list, the values of x only need
 * to be after the elements less than x (see below). The partition element x can appear anywhere in the
 * "right partition"; it does not need to appear between the left and right partitions.
 * EXAMPLE
 * Input:
 * Output:
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
 * 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Problem04 {
  public static Node partition(Node n, int partitionValue) {
    Node head = n;
    Node tail = n;

    while (n != null) {
      Node next = n.next;
      if (n.data < partitionValue) {
        n.next = head;
        head = n;
      } else {
        tail.next = n;
        tail = n;
      }
      n = next;
    }
    tail.next = null;
    return head;
  }

}
