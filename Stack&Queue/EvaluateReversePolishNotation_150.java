import java.util.Stack;

public class EvaluateReversePolishNotation_150 {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
      String s = tokens[i];
      if (s.equals("+")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b + a);
      } else if (s.equals("-")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b - a);
      } else if (s.equals("*")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b * a);
      } else if (s.equals("/")) {
        int a = stack.pop();
        int b = stack.pop();
        stack.push(b / a);
      } else {
        stack.push(Integer.valueOf(s));
      }
    }
    return stack.peek();
  }

  public static void main(String[] args) {
    String[] tokens = { "2", "1", "+", "3", "*" };
    EvaluateReversePolishNotation_150 myclass = new EvaluateReversePolishNotation_150();
    System.out.println(myclass.evalRPN(tokens));

  }
}
