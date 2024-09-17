package September_03_Assignment.casting.Question_8;

public class StringToIntConversion {

    public static void main(String[] args) {

        String strNum = "123";

        int intNum = Integer.parseInt(strNum);

/*        Integer.parseInt("123") converts "123" to the integer 123. This involves:
          Iterating over each character of the String (in this case, '1', '2', and '3').
          Converting these characters to their corresponding numeric values.
          Combining these values according to their position (e.g., units, tens, hundreds).
*/
        System.out.println(intNum);
    }
}
