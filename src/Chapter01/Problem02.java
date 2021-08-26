package Chapter01;

import java.util.HashSet;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the
 * other.
 * Hints: #7, #84, #722, #737
 */
public class Problem02 {
  public static boolean permutation(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    HashSet<Character> chars = new HashSet<>();
    for (int i = 0; i < s1.length(); i++) {
      chars.add(Character.valueOf(s1.charAt(i)));
    }
    for (int i = 0; i < s2.length(); i++) {
      if (chars.add(Character.valueOf(s2.charAt(i)))) { // add returns true if this set did not already contain the specified element
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(permutation("hellothere", "ollehereth"));
  }
}
