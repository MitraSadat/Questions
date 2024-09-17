package September_03_Assignment.operatorPrecedence.Question_8;

public class PrecedenceInBooleanExpressions {

    public static void main(String[] args) {

        boolean expression = true || false && false;
        /*
            In OR (||) logical operator if one side of operator is true then the expression is ture

            true || false && false
            true
         */
        System.out.println(expression);
    }
}
