package August_17_Assignment.Question_49;

import java.util.Scanner;

public class CalculatingSimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate, time;
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter rate amount: ");
        rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

    }
}
