package August_17_Assignment.Question_39;

public class CalculatingCircleProperties {

    public static void main(String[] args) {

        double radius = 7.5;
        double Area, Circumference;

        Area = Math.PI * radius * radius;
        Circumference = 2 * Math.PI * radius;

        System.out.println("Circle Area = " + (int) Area);
        System.out.println("Circle Circumference = " + (int) Circumference);
    }
}
