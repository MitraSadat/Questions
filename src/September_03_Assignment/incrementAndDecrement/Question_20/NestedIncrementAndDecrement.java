package September_03_Assignment.incrementAndDecrement.Question_20;

public class NestedIncrementAndDecrement {

    public static void main(String[] args) {

        int p = 2;
        int q = 3;
        int result = ++p + q++ - --q;

        System.out.println("Result : " + result);
        System.out.println("p : " + p);
        System.out.println("q : " + q);
    }
}
