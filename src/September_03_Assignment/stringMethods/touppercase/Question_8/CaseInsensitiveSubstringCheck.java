package September_03_Assignment.stringMethods.touppercase.Question_8;

public class CaseInsensitiveSubstringCheck {

    public static void main(String[] args) {

        String str = "hello world";
        String subStr = "WORLD";

        if(str.toUpperCase().contains(subStr)) System.out.println("Yes " + subStr + " is the substring of the " + str);
        else System.out.println("No " + subStr + " is not the substring of the " + str);
    }
}
