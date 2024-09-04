package August_17_Assignment.Question_51;

import java.util.Scanner;

public class CalculatingBMIDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weight, height;
        System.out.print("Enter your weight in kilograms: ");
        weight = sc.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);
    }
}
