package August_17_Assignment.Question_52;

import java.util.Scanner;

public class AddingThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
    }
}
