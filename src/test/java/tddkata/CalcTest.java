package tddkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcTest {

  @Test
  void calcEmptyString() {
    Calc calc = new Calc();
    int actual = calc.sum("");
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  void calcEmptyStringNegative() {
    Calc calc = new Calc();
    int actual = calc.sum("");
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  void calcOneParam() {
    Calc calc = new Calc();
    int actual = calc.sum("1");
    int expected = 1;
    assertEquals(expected, actual);
  }

  @Test
  void calcOneParamNegative() {
    Calc calc = new Calc();
    int actual = calc.sum("1");
    int expected = 2;
    assertEquals(expected, actual);
  }

  @Test
  void calcTwoParam() {
    Calc calc = new Calc();
    int actual = calc.sum("1, 2");
    int expected = 3;
    assertEquals(expected, actual);
  }

  @Test
  void calcTwoParamNegative() {
    Calc calc = new Calc();
    int actual = calc.sum("1, 2");
    int expected = 4;
    assertEquals(expected, actual);
  }


}