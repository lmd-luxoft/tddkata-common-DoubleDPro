package tddkata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
    assertNotEquals(expected, actual);
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
    assertNotEquals(expected, actual);
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
    assertNotEquals(expected, actual);
  }

  @Test
  void calcThreeParam() {
    Calc calc = new Calc();
    int actual = calc.sum("1, 2, 3");
    int expected = -1;
    assertEquals(expected, actual);
  }

  @Test
  void calcIncorrectParam() {
    Calc calc = new Calc();
    int actual = calc.sum("Hello!");
    int expected = -1;
    assertEquals(expected, actual);
  }

  @Test
  void calcIncorrectDelimeter() {
    Calc calc = new Calc();
    int actual = calc.sum("1; 2; 3");
    int expected = -1;
    assertEquals(expected, actual);
  }


}