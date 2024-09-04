package August_17_Assignment.Question_23;

import java.util.Scanner;

public class CalculateAgeInDayes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age :");
        int ageInYears = sc.nextInt();

        int ageInDays = ageInYears * 365;
        System.out.println("Your age days is " + ageInDays);
    }
}
