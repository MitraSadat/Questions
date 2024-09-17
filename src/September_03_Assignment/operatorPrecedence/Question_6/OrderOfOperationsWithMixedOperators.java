package September_03_Assignment.operatorPrecedence.Question_6;

public class OrderOfOperationsWithMixedOperators {

    public static void main(String[] args) {

        int expression = 3 + 6 * (5 + 4) / 3 - 7;
            /*
                3 + 6 * (5 + 4) / 3 - 7
                3 + 6 * 9 / 3 - 7
                3 + 6 * 3 - 7
                3 + 18 - 7
                21 - 7
                14
             */
        System.out.println("Result = " + expression);
    }
}
