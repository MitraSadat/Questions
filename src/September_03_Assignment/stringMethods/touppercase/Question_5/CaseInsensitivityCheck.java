package September_03_Assignment.stringMethods.touppercase.Question_5;

public class CaseInsensitivityCheck {

    public static void main(String[] args) {

        String str1 = "HELLO";
        String str2 = "Hello";

        str1 = str1.toUpperCase();

        System.out.println(str1.equals(str2));
    }
}
