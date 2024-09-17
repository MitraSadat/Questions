package September_03_Assignment.stringMethods.equals.Question_9;

public class CheckingForNullStrings {

    public static void main(String[] args) {

        String str1 = null;
        String str2 = "null";

        boolean isEqual = (str1 != null) && str1.equals(str2);

        System.out.println(isEqual);


    }
}
