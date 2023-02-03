import java.util.PriorityQueue;

public class PQ {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    System.out.println(pq);
  }
}
