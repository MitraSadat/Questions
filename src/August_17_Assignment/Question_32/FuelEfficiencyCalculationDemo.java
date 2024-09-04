package August_17_Assignment.Question_32;

public class FuelEfficiencyCalculationDemo {

    public static void main(String[] args) {

        double distance = 500.0; // kilometers
        double fuelUsed = 40.0; // liters
        double fuelEfficiency;

        fuelEfficiency = distance / fuelUsed;
        System.out.println("Fuel efficiency: " + fuelEfficiency + " kilometers per liter");
    }
}
