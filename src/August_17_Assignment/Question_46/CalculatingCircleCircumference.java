package August_17_Assignment.Question_46;

import java.util.Scanner;

public class CalculatingCircleCircumference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;
        System.out.println("The circumference of the circle is " + (int) circumference);
    }
}
