import java.util.Stack;

public class RemoveAdjacentDuplicates_1047 {
  public String removeDuplicates(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (stack.isEmpty()) {
        stack.push(s.charAt(i));
      } else {
        if (stack.peek() != s.charAt(i)) {
          stack.push(s.charAt(i));
        } else {
          stack.pop();
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    Stack<Character> temp = new Stack<>();
    while (!stack.isEmpty()) {
      temp.push(stack.pop());
    }
    while (!temp.isEmpty()) {
      sb.append(temp.pop());
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String s = "azxxzy";
    RemoveAdjacentDuplicates_1047 myclass= new RemoveAdjacentDuplicates_1047();
    System.out.println(myclass.removeDuplicates(s));
  }
}
