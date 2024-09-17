package September_03_Assignment.casting.Question_6;

public class NarrowingCastWithOverflow {

    public static void main(String[] args) {

        long bigNum = 2147483648L;
        int intNum = (int) bigNum;

//        When you cast a long value to an int, only the lower 32 bits of the long value are used to produce the int result.
//        This means that any bits beyond the 32nd bit are discarded.
        System.out.println(intNum);
    }
}
