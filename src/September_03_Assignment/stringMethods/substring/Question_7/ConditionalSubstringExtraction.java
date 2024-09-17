package September_03_Assignment.stringMethods.substring.Question_7;

public class ConditionalSubstringExtraction {

    public static void main(String[] args) {

        String str = "WelcomeToJavaProgramming";
        int length = str.length();
        String subStr;

        if (length%2 == 0) {
            subStr = str.substring(0, length / 2);
            System.out.println(subStr);
        }else {
            subStr = str.substring(0, 3);
            System.out.println(subStr);
        }
    }
}
