package September_03_Assignment.stringMethods.length.Question_5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AnalyzingLengthOfUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String userInput = input.nextLine();
        System.out.println("The string length is : " + userInput.length());
    }
}
