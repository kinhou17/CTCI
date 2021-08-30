package Chapter03;

import java.util.Stack;

/**
 * Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
 * an additional temporary stack, but you may not copy the elements into any other data structure
 * (such as an array). The stack supports the following operations: push, pop, peek, and is Empty.
 */
public class Problem05 {
  void sort (Stack<Integer> s) {
    Stack<Integer> r = new Stack<>();
    while (!s.isEmpty()) {
      int temp = s.pop();
      while (!r.isEmpty() && r.pop() > temp) {
        s.push(r.pop());
      }
      r.push(temp);
    }

    while (!r.isEmpty()) {
      s.push(r.pop());
    }
  }

}
