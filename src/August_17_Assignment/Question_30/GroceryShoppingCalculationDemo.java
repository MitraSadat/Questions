package August_17_Assignment.Question_30;

public class GroceryShoppingCalculationDemo {

    public static void main(String[] args) {

        int apples = 3, bananas = 6;
        double pricePerApple = 0.50, pricePerBanana = 0.30;

        double totalApplesCost = apples * pricePerApple;
        double totalBananasCost = bananas * pricePerBanana;
        double totalCost = totalApplesCost + totalBananasCost;

        System.out.println("Total apples cost: " + totalApplesCost);
        System.out.println("Total bananas cost: " + totalBananasCost);
        System.out.println("Total costs : " + totalCost);
    }
}
