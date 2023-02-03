import java.util.ArrayDeque;
import java.util.Deque;
/**
 * While using a deque is extremely easy, but think about this:
 * when pop an element, pop and push the other elements(size-1)
 */

public class ImplementStackUsingQueue_225 {
  Deque<Integer> queue;

  public ImplementStackUsingQueue_225() {
    queue = new ArrayDeque<>();
  }

  public void push(int x) {
    queue.addFirst(x);
  }

  public int pop() {
    return queue.removeFirst();
  }

  public int top() {
    return queue.getFirst();
  }

  public boolean empty() {
    return queue.size() == 0;
  }

  public static void main(String[] args) {

  }
}
