package September_03_Assignment.incrementAndDecrement.Question_15;

public class PreAndPostIncrementInSameExpression {

    public static void main(String[] args) {

        int u = 3;
        int result = ++u + u++;

        System.out.println("result = " + result);
        System.out.println("u = " + u);
    }
}
