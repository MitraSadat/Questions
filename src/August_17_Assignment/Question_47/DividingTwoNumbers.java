package August_17_Assignment.Question_47;

import java.util.Scanner;

public class DividingTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second double number: ");
        double num2 = sc.nextDouble();

        double dividedResult = num1 / num2;
        System.out.println("The result of " + num1 + " dividing by " + num2 + " is: " + dividedResult);
    }
}
