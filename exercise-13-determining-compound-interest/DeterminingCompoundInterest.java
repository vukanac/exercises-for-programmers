import java.math.BigDecimal;
import java.math.RoundingMode;

class DeterminingCompoundInterest {
  public static void main(String[] args) {
    var line = System.console().readLine("What is the principal amount? ");
    var principal = Double.parseDouble(line);

    line = System.console().readLine("What is the rate? ");
    var rate = Double.parseDouble(line);

    line = System.console().readLine("What is the number of years? ");
    var time = Integer.parseInt(line);

    line = System.console().readLine("What is the number times the interest is compounded per year? ");
    var compoundsPerYear = Integer.parseInt(line);

    var amount = new BigDecimal(principal * Math.pow((1 + (rate / 100) / compoundsPerYear), compoundsPerYear * time)).setScale(2, RoundingMode.UP);

    var output = String.format("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%s", principal, rate, time, compoundsPerYear, amount);
    System.out.println(output);
  }
}
