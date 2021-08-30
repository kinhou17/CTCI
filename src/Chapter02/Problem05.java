package Chapter02;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 -> 1 -> 2. That is, 912.
 */
public class Problem05 {
  public static Node sumLists(Node n1, Node n2) {
    Node newList = n1;
    Node returnList = newList;
    int carry = 0;
    while (n1 != null || n2 != null) {
      if (n1 != null && n2 != null) {
        returnList.data = (n1.data + n2.data + carry) % 10;
        carry = (n1.data + n2.data + carry) / 10;
      } else if (n1 == null && n2 != null) {
        returnList.data = (n2.data + carry) % 10;
        carry = (n2.data + carry) / 10;
      } else {
        returnList.data = (n1.data + carry) % 10;
        carry = (n1.data + carry) / 10;
      }
      returnList = returnList.next;
      n1 = n1.next;
      n2 = n2.next;
    }

    return newList;
  }
}
