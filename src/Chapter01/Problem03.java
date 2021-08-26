package Chapter01;

import java.util.ArrayList;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 */
public class Problem03 {
  public String URLify(String s) {
    char[] chars = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      chars[i] = s.charAt(i);
    }
    String url = "";
    for (int i = 0; i < s.length(); i++) {
      if (chars[i] == ' ') {
        url = url + "%20";
        continue;
      }
      url = url + chars[i];
    }
    return url;
  }

}
