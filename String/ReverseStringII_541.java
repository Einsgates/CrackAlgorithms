/**
 * Similiar reverse method, but deal with strings by jumping
 * Additionally, don't forget to cope with remaining characters
 */
public class ReverseStringII_541 {
  public String reverseStr(String s, int k) {
    char[] str = s.toCharArray();
    if (s.length() <= k) {
      reverse(str, 0, s.length() - 1);
      return new String(str);
    }
    int i = 0;
    while (i < str.length && i + k - 1 < str.length) {
      reverse(str, i, i + k - 1);
      i += 2 * k;
    }
    // if the remaining length is between 0 to k, mannual reverse them
    if (i < str.length && i + k - 1 >= str.length) {
      reverse(str, i, str.length - 1);
    }
    return new String(str);
  }

  void reverse(char[] str, int i, int j) {
    while (i < j) {
      char temp = str[i];
      str[i] = str[j];
      str[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    String s = "abcdefghijk";
    int k = 4;
    ReverseStringII_541 myclass = new ReverseStringII_541();
    System.out.println(myclass.reverseStr(s, k));
  }
}
