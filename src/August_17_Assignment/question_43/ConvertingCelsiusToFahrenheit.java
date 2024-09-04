package August_17_Assignment.question_43;

import java.util.Scanner;

public class ConvertingCelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Cilsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
