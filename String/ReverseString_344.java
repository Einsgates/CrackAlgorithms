/**
 * Use two pointers and swap the value of s[i] and s[j]
 */
public class ReverseString_344 {
  public void reverseString(char[] s) {
    int i = 0, j = s.length - 1;
    while (i < j) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    char[] s = { 'h', 'e', 'l', 'l', 'o' };
    ReverseString_344 myclass = new ReverseString_344();
    myclass.reverseString(s);
    System.out.println(s);
  }
}