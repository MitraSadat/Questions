package August_17_Assignment.Question_53;

import java.util.Scanner;

public class CalculatingTotalPrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double quantity, pricePerItem;
        System.out.print("Enter item quantity: ");
        quantity = sc.nextDouble();
        System.out.print("Enter item price per item: ");
        pricePerItem = sc.nextDouble();

        double totalPrice = quantity * pricePerItem;
        System.out.println("Total price is $" + totalPrice);

    }
}
