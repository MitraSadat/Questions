package September_03_Assignment.casting.Question_9;

public class CastingLargerDataTypesToSmaller {

    public static void main(String[] args) {

        double decimalValue = 123.456;
        byte byteValue = (byte) decimalValue;
//      The fractional part of the double is discarded, and if the value exceeds the byte range,
//      overflow occurs, leading to unexpected results.
        System.out.println(byteValue);
    }
}
