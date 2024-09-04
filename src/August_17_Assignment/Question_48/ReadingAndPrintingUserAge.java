package August_17_Assignment.Question_48;

import java.util.Scanner;

public class ReadingAndPrintingUserAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("You are " + age + " years old.");
    }
}
