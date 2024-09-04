package August_17_Assignment.Question_29;

public class CurrencyConversion {

    public static void main(String[] args) {

        double usdAmount = 100.0;
        double conversionRate = 0.85;

        double eurAmount = usdAmount * conversionRate;

        System.out.println("Equivalent Amount in EUR is : " + eurAmount);
    }
}
