package August_17_Assignment.Question_42;

import java.util.Scanner;

public class CalculatingRectangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        double Area = length * width;

        System.out.println("The area of the rectangle is " + Area);

    }
}
