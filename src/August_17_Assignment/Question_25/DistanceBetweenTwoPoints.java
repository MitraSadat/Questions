package August_17_Assignment.Question_25;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        double x1 = 4.0, y1 = 3.0;
        double x2 = 6.0, y2 = 7.0;
        double Distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distance between tow points is : " + Distance);
    }
}
