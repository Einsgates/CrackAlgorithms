/**
 * Later study how KMP works!
 */
public class FindIndexOfFirstOccurrence_28 {
  public int strStr(String haystack, String needle) {
    int i = 0;
    while (i < haystack.length() - needle.length() + 1) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      } else {
        i++;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String haystack = "leetcode";
    String needle = "sad";
    // System.out.println(haystack.substring(1, 4).equals(needle));
    FindIndexOfFirstOccurrence_28 myclass = new FindIndexOfFirstOccurrence_28();
    System.out.println(myclass.strStr(haystack, needle));
  }
}
