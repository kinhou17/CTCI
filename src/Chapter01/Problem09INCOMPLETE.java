package Chapter01;

/**
 *  String Rotation:Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
 * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
 */
public class Problem09INCOMPLETE {
  public static boolean isRotation(String s1, String s2) {
    int len = s1.length();
    if (len == s2.length() && len > 0) {
      String s1s1 = s1 + s1;
      return true;//isSubstring(s1s1, s2);
    }
    return false;
  }
}
