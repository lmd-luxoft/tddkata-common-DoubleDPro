package tddkata;

public class Calc {

  public int sum(String expression) {
    String currentDelimiter = ",|\n";
    if (expression != null && !expression.isEmpty()) {
      if (expression.startsWith("//")) {
        if (expression.contains("\n")) {
          currentDelimiter = expression.substring(2, expression.indexOf("\n"));
          expression = expression.substring(expression.indexOf("\n") + 1);
        } else {
          return -1;
        }

      }

      String[] numbers = expression.split(currentDelimiter);
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
