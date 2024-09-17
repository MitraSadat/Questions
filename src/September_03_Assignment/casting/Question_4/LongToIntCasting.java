package September_03_Assignment.casting.Question_4;

public class LongToIntCasting {

    public static void main(String[] args) {

        long longNum = 1000000L;
//      Casting a long to an int involves truncating the value to fit into the smaller int data type.
//      In this case, the cast to int is safe because 1000000 is within the range of an int. However, it's essential to
//      ensure that the long value being cast does not exceed the int range to avoid unexpected data loss or overflow issues
        int intNum = (int) longNum;
        System.out.println(intNum);
    }
}
