package August_17_Assignment.Question_37;

public class MonthlyPaymentCalculation {

    public static void main(String[] args) {

        double loanAmount = 15000.0;
        double annualInterestRate = 3.5;
        int loanTermYears = 5;
        double monthlyPayment = (loanAmount * (annualInterestRate/100) / 12);

        System.out.println("Monthly payment is " + monthlyPayment);

    }
}
