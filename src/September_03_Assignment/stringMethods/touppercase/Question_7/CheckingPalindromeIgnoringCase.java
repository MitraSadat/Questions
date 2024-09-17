package September_03_Assignment.stringMethods.touppercase.Question_7;

public class CheckingPalindromeIgnoringCase {

    public static void main(String[] args) {

        String str = "Racecar";

        String upperCaseString = str.toUpperCase();

        String reversedStr = "";
        for (int i = upperCaseString.length() - 1; i >= 0; i--) {
            reversedStr += upperCaseString.charAt(i);
        }

        if (upperCaseString.equals(reversedStr)) System.out.println("The string is a palindrome.");
        else System.out.println("The string is not a palindrome.");
    }
}
