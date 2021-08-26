package Chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 *  Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
 *  A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words
 */
public class Problem04 {
  public static boolean palindromePermutation(String s) {
    HashMap<Character, Integer> chars = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character currChar = Character.valueOf(s.charAt(i));
      if (chars.containsKey(currChar)) {
        chars.put(currChar, chars.get(currChar) + 1);
      } else {
        chars.put(currChar, 1);
      }
    }
    int oddCount = 0;
    for (Map.Entry<Character, Integer> c : chars.entrySet()) {
      if (s.length() % 2 == 0 && c.getValue() != 2) {
        return false;
      } else if (s.length() % 2 == 1 && c.getValue() % 2 == 1) {
        oddCount++;
      }
    }
    if (oddCount > 1) {
      return false;
    }
    return true;
  }

  public static void main(String args[]) {
    System.out.println(palindromePermutation("stanleyyelnats"));
  }
}
