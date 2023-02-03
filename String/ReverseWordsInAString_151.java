/**
 * Remember to implement those functions:
 * trim()
 * split()
 */
public class ReverseWordsInAString_151 {
  public String reverseWords(String s) {
    String[] strArray = s.trim().split("\\s+");
    StringBuilder res = new StringBuilder();
    for (int i = strArray.length - 1; i >= 0; i--) {
      res.append(strArray[i] + " ");
    }
    return res.toString().trim();
  }
  void myTrim(String s) {
    StringBuilder sb = new StringBuilder();
    int flag = 0;
    
  }
  void printArray(String[] str) {
    for (String s : str) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    String s = "a good   example    ";
    ReverseWordsInAString_151 myclass = new ReverseWordsInAString_151();
    System.out.println(myclass.reverseWords(s));
  }
}
