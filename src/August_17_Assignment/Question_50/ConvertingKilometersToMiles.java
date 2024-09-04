package August_17_Assignment.Question_50;

import java.util.Scanner;

public class ConvertingKilometersToMiles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Kilometers : ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;

        System.out.println("Distance in miles : "+ miles);
    }
}
