import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements_347 {
  public int[] topKFrequent(int[] nums, int k) {
    if (nums.length == 1) {
      return nums;
    }
    int[] res = new int[k];
    HashMap<Integer, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (freqMap.containsKey(nums[i])) {
        freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
      } else {
        freqMap.put(nums[i], 1);
      }
    }
    HashMap<Integer, Integer> myMap = sortByValue(freqMap);
    List<Integer> list = new ArrayList<>(myMap.keySet());
    for (int i = 0; i < k; i++) {
      res[i] = list.get(i);
    }
    printArray(res);
    return res;
  }

  public int[] topKFrequent2(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      pq.add(new int[] { entry.getKey(), entry.getValue() });
    }
    int[] res = new int[k];
    for (int i = 0; i < k; i++) {
      res[i] = pq.poll()[0];
    }
    printArray(res);
    return res;
  }

  /**
   * This method sorts the map by value
   * 
   * @param hm
   * @return map sorted by value
   * 
   */
  HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
    List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
      @Override
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
    });
    HashMap<Integer, Integer> temp = new LinkedHashMap<>();
    for (Map.Entry<Integer, Integer> entry : list) {
      temp.put(entry.getKey(), entry.getValue());
    }
    return temp;
  }

  void printArray(int[] nums) {
    for (int e : nums) {
      System.out.print(e);
      System.out.print(' ');
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 2, 2, 3 };
    int k = 2;
    TopKFrequentElements_347 t = new TopKFrequentElements_347();
    System.out.println(t.topKFrequent2(nums, k));
  }
}
