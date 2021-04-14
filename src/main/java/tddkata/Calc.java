package tddkata;

public class Calc {

  public int sum(String expression) {
    if (expression != null && !expression.isEmpty()) {
      String[] numbers = expression.split(",|\n");
      int[] digits = new int[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
        try {
          digits[i] = Integer.parseInt(numbers[i]);
        } catch (NumberFormatException e) {
          return -1;
        }
      }
      int sum = 0;
      for (int digit : digits) {
        sum += digit;
      }
      return sum;
    } else {
      return -1;
    }
  }
}
