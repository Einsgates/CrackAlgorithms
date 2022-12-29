/*This problem use a double pointer, dynamic calculating maxArea
  Notify that left pointer starts from leftmost and right pointer starts from right most
  , then they come to each other until they meet
*/
public class ContainerWithMostWater_11 {
  public int maxArea(int[] height) {
    int maxWater = 0;
    int i = 0, j = height.length - 1;
    while (i <= j) {
      maxWater = Math.max(maxWater, calculateWater(height, i, j));
      //! This step is critial, think about why!
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }

    }
    return maxWater;
  }

  int calculateWater(int[] height, int i, int j) {
    int length = j - i;
    int width = Math.min(height[i], height[j]);
    return length * width;
  }

  public static void main(String[] args) {
    int[] height = { 1, 1 };
    ContainerWithMostWater_11 myclass = new ContainerWithMostWater_11();
    System.out.println(myclass.maxArea(height));
  }
}
