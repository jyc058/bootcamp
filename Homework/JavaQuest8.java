/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here ...
    int[][] arrays = {
      { -10, 5, 100, 240, 230, 80 },
      { -10, 5, 100, 120, 240, 200 },
      { -10, 5, 120, -100, 100, 240 },
      { -10, 5, 100, 240, 240, 80 }
  };
    for (int i = 0; i < arrays.length; i++) {
      int[] nums = arrays[i];
      int max = Integer.MIN_VALUE;
      int secondMax = Integer.MIN_VALUE;

      for (int j = 0; j < nums.length; j++) {
          int num = nums[j];

          if (num > max) {
              secondMax = max;
              max = num;
          } else if (num > secondMax && num < max) {
              secondMax = num;
          }
      }

      if (secondMax == Integer.MIN_VALUE) {
          System.out.println("No second maximum value found.");
      } else {
          System.out.println("Second Max = " + secondMax);
      }
  }
}
}