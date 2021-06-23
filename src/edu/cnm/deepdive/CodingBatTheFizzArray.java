package edu.cnm.deepdive;

/*

Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array. You do not need a separate
if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */

import java.util.Arrays;

public class CodingBatTheFizzArray {

  public static void main(String[] args) {
    System.out.printf("Given the int %d, the array will be " + Arrays.toString(fizzArray(4)) + ".\n", 4);
    System.out.printf("Given the int %d, the array will be " + Arrays.toString(fizzArray(0)) + ".\n", 0);
    System.out.printf("Given the int %d, the array will be " + Arrays.toString(fizzArray(10)) + ".\n", 10);
  }

  public static int[] fizzArray(int n) {
    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      result[i] += i;
    }
    return result;
  }

}
