package September_03_Assignment.stringMethods.equals.Question_10;

public class ComparingSubstringsForEquality {

    public static void main(String[] args) {

        String str = "Welcome to Java Programming";
        String subStr = "Java";
        String ExtractedSubStr = str.substring(11, 15);

        boolean isEqual =subStr.equals(ExtractedSubStr);

        if(isEqual) System.out.println("The strings are equal.");
        else System.out.println("The strings are not equal.");

    }
}
