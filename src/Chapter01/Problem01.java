package Chapter01;

import java.util.HashMap;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 * Hints: #44, #7 7 7, #732
 */
public class Problem01 {
  public boolean unique(String s) {
    boolean[] chars = new boolean[128];
    for (int i = 0; i < s.length(); i++) {
      if (chars[s.charAt(i)]) {
        return false;
      }
      chars[s.charAt(i)] = true;
    }
    return true;
  }
}
