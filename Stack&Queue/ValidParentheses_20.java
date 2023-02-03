import java.util.Stack;

public class ValidParentheses_20 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    int cnt = 0;
    char[] arr = s.toCharArray();
    if (arr.length % 2 != 0) {
      return false;
    }
    for (char e : arr) {
      if (e == '(' || e == '{' || e == '[') {
        stack.push(e);
        cnt++;
        continue;
      }
      if (e == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        if (stack.peek() == '(') {
          stack.pop();
          cnt--;
        } else {
          return false;
        }
      } else if (e == '}') {
        if (stack.isEmpty()) {
          return false;
        }
        if (stack.peek() == '{') {
          stack.pop();
          cnt--;
        } else {
          return false;
        }
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        if (stack.peek() == '[') {
          stack.pop();
          cnt--;
        } else {
          return false;
        }
      }
    }
    return cnt == 0;
  }

  public static void main(String[] args) {
    String s = "){";
    ValidParentheses_20 myclass = new ValidParentheses_20();
    System.out.println(myclass.isValid(s));
    System.out.println(65 * 65+625);
  }
}
