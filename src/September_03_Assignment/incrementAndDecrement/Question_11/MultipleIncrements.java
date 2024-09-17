package September_03_Assignment.incrementAndDecrement.Question_11;

public class MultipleIncrements {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int result = x++ + ++y;

        System.out.println("Result: " + result);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
