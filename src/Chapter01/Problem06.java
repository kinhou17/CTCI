package Chapter01;

/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class Problem06 {
  public static String stringCompression(String s) {
    String returnString = "";
    for (int i = 0; i < s.length(); i++) {
      returnString = returnString + s.charAt(i);
      int j = 0;
      while(i + j < s.length() && s.charAt(i) == s.charAt(i + j)) {
        j++;
      }
      returnString = returnString + String.valueOf(j);
      i = i + j - 1;
    }
    if (returnString.length() < s.length()) {
      return returnString;
    }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(stringCompression("aabcccccaaa"));
  }
}
