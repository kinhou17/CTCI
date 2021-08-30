package Chapter03;

import java.util.Stack;

/**
 * Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks
 */
public class Problem04 {
  Stack<Integer> s1;
  Stack<Integer> s2;

  public Problem04() {
    s1 = new Stack<>();
    s2 = new Stack<>();
  }

  public void push(int n) {
    s1.push(n);
  }

  public void shiftStacks() {
    if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
    }
  }

  public Integer peek() {
    shiftStacks();
    return s2.peek();
  }

  public Integer pop() {
    shiftStacks();
    return s2.pop();
  }
}
