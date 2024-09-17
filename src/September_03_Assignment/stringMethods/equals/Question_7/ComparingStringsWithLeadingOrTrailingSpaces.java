package September_03_Assignment.stringMethods.equals.Question_7;

public class ComparingStringsWithLeadingOrTrailingSpaces {

    public static void main(String[] args) {

        String str1 = " Hello ";
        String str2 = "Hello";

        boolean isEqual = str1.trim().equals(str2);

        if(isEqual) System.out.println("The strings are equal after removing leading and trailing spaces.");
        else System.out.println("The strings are not equal after removing leading and trailing spaces.");
    }
}
