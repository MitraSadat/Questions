package August_17_Assignment.Question_35;

public class CalculatingCompoundInterest {

    public static void main(String[] args) {

        double principalAmount = 2000.0;
        double annualRate = 4.5;
        int years = 5;
        double Amount = principalAmount * Math.pow((1 + annualRate/100), years);

        System.out.println("Compound interest is : " + (int) Amount);
    }
}
