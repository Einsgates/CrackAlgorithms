import java.util.HashMap;
import java.util.Map;
/**
 * 1: Use hashmap to record
 * 2: Use array to record the frequency and is much faster
 */
public class RansomNote_383 {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      if (map.containsKey(magazine.charAt(i))) {
        map.put(magazine.charAt(i), 1 + map.get(magazine.charAt(i)));
      } else {
        map.put(magazine.charAt(i), 1);
      }
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      if (!map.containsKey(ransomNote.charAt(i)) || map.get(ransomNote.charAt(i)) <= 0) {
        return false;
      }
      map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
    }
    return true;
  }
  boolean canConstruct2(String ransomNote, String magazine) {
    int[] map = new int[26];
    for (int i = 0; i < magazine.length(); i++) {
      map[magazine.charAt(i)-'a']++;
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      if (map[ransomNote.charAt(i)-'a'] <= 0) {
        return false;
      }
      map[ransomNote.charAt(i)-'a']--;
    }
    return true;
  }
  public static void main(String[] args) {
    String ransomNote = "aa";
    String magazine = "aab";
    RansomNote_383 myclass = new RansomNote_383();
    System.out.println(myclass.canConstruct2(ransomNote, magazine));
  }
}
