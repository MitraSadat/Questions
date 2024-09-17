package September_03_Assignment.stringMethods.substring.Question_6;

public class SubstringPuzzle {

    public static void main(String[] args) {

        String str = "abcdefgh";
        String rearengeStr;

        String subStr1 = str.substring(0, 4);
        String subStr2 = str.substring(4, 8);

        rearengeStr = subStr2 + subStr1;
        System.out.println(rearengeStr);

    }
}
