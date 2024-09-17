package September_03_Assignment.stringMethods.tolowercase.Question_7;

public class CheckingPalindromeIgnoringCase {

    public static void main(String[] args) {

        String str = "Madam";

        String reversedStr = "";
        for (int i = str.toLowerCase().length() - 1; i >= 0; i--) {
            reversedStr += str.toLowerCase().charAt(i);
        }

        if (str.toLowerCase().equals(reversedStr)) System.out.println("The string is a palindrome.");
        else System.out.println("The string is not a palindrome.");

    }
}
