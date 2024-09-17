package September_03_Assignment.incrementAndDecrement.Question_12;

public class MixedIncrementsAndDecrements {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int result = a-- - ++b;

        System.out.println("Result: " + result);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
