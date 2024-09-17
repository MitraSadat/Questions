package September_03_Assignment.stringMethods.equals.Question_6;

public class CaseInsensitiveComparison {

    public static void main(String[] args) {

        String str1 = "Java Programming", str2 = "java programming";

        boolean areEqual = str1.equalsIgnoreCase(str2);

        if (areEqual) {
            System.out.println("The strings are considered equal.");
        } else {
            System.out.println("The strings are not considered equal.");
        }
    }
}
