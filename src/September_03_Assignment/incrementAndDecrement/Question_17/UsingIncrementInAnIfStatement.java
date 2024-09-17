package September_03_Assignment.incrementAndDecrement.Question_17;

public class UsingIncrementInAnIfStatement {

    public static void main(String[] args) {

        int a = 4;

        if (++a == 5) {
            //here ++a becomes 5 so 5 == 5
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
