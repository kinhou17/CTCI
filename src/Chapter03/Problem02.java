package Chapter03;

import java.util.Stack;

/**
 * Stack Min: How would you design a stack which, in addition to push and pop, has a function min
 * which returns the minimum element? Push, pop and min should all operate in 0(1) time.
 */
public class Problem02 extends Stack<Integer> {
  Stack<Integer> mins;

  public Problem02() {
    this.mins = new Stack<Integer>();
  }

  public void push(int value) {
    if (value <= this.min()) {
      mins.push(value);
    }
    super.push(value);
  }

  public Integer pop() {
    int value = super.pop();
    if (value == min()) {
      mins.pop();
    }
    return value;
  }

  public int min() {
    if (mins.isEmpty()) {
      return Integer.MAX_VALUE;
    } else {
      return mins.peek();
    }
  }
}
