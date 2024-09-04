package August_17_Assignment.Question_40;

import java.util.Scanner;

public class ReadingAndPrintingUserName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Good Morning! " + firstName + " " + lastName);

    }
}
