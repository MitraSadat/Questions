package September_03_Assignment.casting.Question_7;

public class CastingBetweenPrimitiveAndWrapperTypes {

    public static void main(String[] args) {

        Integer num = new Integer(50);

        int num2 = num + 10;

//        In the expression int primitiveNum = num;, Java performs unboxing. Unboxing is the process where the Integer
//        object num is automatically converted back to the int primitive type. This allows you to use num as if it were a regular int.
        System.out.println(num2);
    }
}
