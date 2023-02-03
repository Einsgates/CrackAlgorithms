/**
 * This is a quadratic algorithms 
 * !while KMP can reduce this to linear complexity, which you should study and do later
 */
public class RepeatedSubstringPattern_459 {
  public boolean repeatedSubstringPattern(String s) {
    int len = s.length();
    for (int i = len / 2; i >= 1; i--) {
      if (len % i == 0) {
        int num_repeats = len / i;
        StringBuilder sb = new StringBuilder();
        String subStr = s.substring(0,i);
        for (int j = 0; j < num_repeats; j++) {
          sb.append(subStr);
        }
        if (sb.toString().equals(s)) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String s = "abcabcabcabc";
    RepeatedSubstringPattern_459 myclass = new RepeatedSubstringPattern_459();
    System.out.println(myclass.repeatedSubstringPattern(s));
  }
}
