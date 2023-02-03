import java.util.Stack;

public class ImplementQueueUsingStacks_232 {
  Stack<Integer> stackIn;
  Stack<Integer> stackOut;

  public ImplementQueueUsingStacks_232() {
    stackIn = new Stack<>();
    stackOut = new Stack<>();
  }

  public void push(int x) {
    stackIn.push(x);
  }

  public int pop() {
    dumpStackIn();
    return stackOut.pop();
  }

  public int peek() {
    dumpStackIn();
    return stackOut.peek();
  }

  private void dumpStackIn() {
    if (!stackOut.isEmpty()) return;
    while (!stackIn.isEmpty()) {
      stackOut.push(stackIn.pop());
    }
  }

  public boolean empty() {
    while (!stackIn.isEmpty()) {
      stackOut.push(stackIn.pop());
    }
    return stackOut.empty();
  }

  public static void main(String[] args) {

  }
}