import java.util.HashSet;
import java.util.Set;
/**
 * Use a hashset to record every occurred sum and keep it
 * If the sum appear again, return false
 * If sum is 1, return true
 */
public class HappyNumber_202 {
  public boolean isHappy(int n) {
    Set<Integer> record = new HashSet<>();
    while (n != 1 && !record.contains(n)) {
      record.add(n);
      n = getDigitsSquare(n);
    }
    return n == 1;
  }

  int getDigitsSquare(int n) {
    int a = n;
    int sum = 0;
    while (a > 0) {
      sum += (a % 10) * (a % 10);
      a /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 2;
    HappyNumber_202 myclass = new HappyNumber_202();
    System.out.println(myclass.isHappy(n));
  }
}
