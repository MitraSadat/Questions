package September_03_Assignment.incrementAndDecrement.Question_16;

public class PreAndPostDecrementInSameExpression {

    public static void main(String[] args) {

        int v = 9;
        int result = --v - v--;

        System.out.println("result = " + result);
        System.out.println("v = " + v);
    }
}
