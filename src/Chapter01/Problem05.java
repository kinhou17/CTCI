package Chapter01;

import java.util.HashMap;
import java.util.Map;

/**
 * One Away: There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class Problem05 {
  public static boolean oneEditAway(String s1, String s2) {
    HashMap<Character, Integer> chars = new HashMap<>();
    for (int i = 0; i < s1.length(); i++) {
      chars.put(Character.valueOf(s1.charAt(i)), 1);
    }
    for (int i = 0; i < s2.length(); i++) {
      Character currChar = Character.valueOf(s2.charAt(i));
      if (chars.containsKey(currChar)) {
        chars.put(currChar, chars.get(currChar) + 1);
      } else {
        chars.put(currChar, 1);
      }
    }
    int editCount = 0;
    for (Map.Entry<Character, Integer> c : chars.entrySet()) {
      if (c.getValue() % 2 == 1) {
        editCount++;
      }
    }
    if (editCount > 1 && s1.length() != s2.length()) {
      return false;
    }
    if (editCount > 2 && s1.length() == s2.length()) {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(oneEditAway("pale", "ple"));
    System.out.println(oneEditAway("pales", "pale"));
    System.out.println(oneEditAway("pale", "bale"));
    System.out.println(oneEditAway("pale", "bake"));
  }

}
