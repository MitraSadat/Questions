package September_03_Assignment.stringMethods.contains.Question_10;

import java.util.Locale;

public class CaseInsensitiveSubstringCheck {

    public static void main(String[] args) {

        String str = "Data Mining Techniques";
        String subStr = "data";

        String strLowerCase = str.toLowerCase();
        String subStrLowerCase = subStr.toLowerCase();

        boolean isFound = strLowerCase.contains(subStrLowerCase);

        if (isFound) System.out.println("Match found.");
        else System.out.println("No match found");
    }
}
