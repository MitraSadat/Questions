package September_03_Assignment.operatorPrecedence.Question_10;

import java.util.Scanner;

public class ComplexExpressionWithScannerInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        /*
            * ()
            * / and *
            * + and -
         */
        int result = (firstNumber + secondNumber) * firstNumber / secondNumber + 2;
        System.out.println("Result = " + result);

    }
}
