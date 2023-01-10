/**
 * An optimized solution: using just one array
 */
public class ValidAnagram_242 {
  public boolean isAnagram(String s, String t) {
    int[] arr1 = new int[26];
    int[] arr2 = new int[26];
    for (int i = 0; i < s.length(); i++) {
      arr1[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < t.length(); i++) {
      arr2[t.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaramf";
    ValidAnagram_242 myclass = new ValidAnagram_242();
    System.out.println(myclass.isAnagram(s, t));
  }
}