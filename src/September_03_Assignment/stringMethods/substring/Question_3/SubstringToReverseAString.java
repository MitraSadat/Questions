package September_03_Assignment.stringMethods.substring.Question_3;

public class SubstringToReverseAString {

    public static void main(String[] args) {

        String str = "ReverseMe";

        String subStr1 = str.substring(0, 7);
        String subStr2 = str.substring(str.indexOf("Me"));

        String reverseStr = subStr2 + subStr1;

        System.out.println(reverseStr);
    }
}
