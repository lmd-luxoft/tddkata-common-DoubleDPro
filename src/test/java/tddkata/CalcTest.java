package tddkata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {

  @Test
  void calc() {
    Calc calc = new Calc();
    int actual = calc.sum("");
    int expected = 0;
    Assertions.assertEquals(expected, actual);
  }
}