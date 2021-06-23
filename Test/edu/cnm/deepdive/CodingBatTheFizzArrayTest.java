package edu.cnm.deepdive;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheFizzArrayTest {

  private int[] fizzParams = {4, 1, 10, 0, 2, 7};

  private int[][] fizzExpected = {
      {0, 1, 2, 3},
      {0},
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
      {},
      {0, 1},
      {0, 1, 2, 3, 4, 5, 6}
  };

  @Test
  void fizzTest() {
    for (int i = 0; i < fizzParams.length; i++) {
      int[] actual = CodingBatTheFizzArray.fizzArray(fizzParams[i]);
      Assertions.assertEquals(Arrays.toString(actual), Arrays.toString(fizzExpected[i]));
    }
  }


}