package August_17_Assignment.Question_45;

import java.util.Scanner;

public class MultiplyingTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second double number: ");
        double num2 = sc.nextDouble();

        double result = num1*num2;
        System.out.println("The multiplication of two numbers is: " + result);
    }
}
