package August_17_Assignment.Question_26;

public class CalculatingBMI {

    public static void main(String[] args) {

//      weight in kilograms
        double weight = 70.0;
//      height in meters
        double height = 1.75;

        double BMI = weight / (height * height);

        System.out.print(" BMI is " + (int) BMI);
    }
}
