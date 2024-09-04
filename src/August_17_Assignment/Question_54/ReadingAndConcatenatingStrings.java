package August_17_Assignment.Question_54;

import java.util.Scanner;

public class ReadingAndConcatenatingStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName, lastName, fullName;

        System.out.print("Enter your first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        lastName = sc.nextLine();
        fullName = firstName + " " + lastName;

        System.out.println("Your full name is : " + fullName);

    }
}
