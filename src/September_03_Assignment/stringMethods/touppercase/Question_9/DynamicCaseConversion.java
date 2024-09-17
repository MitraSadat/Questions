package September_03_Assignment.stringMethods.touppercase.Question_9;

public class DynamicCaseConversion {

    public static void main(String[] args) {

        String str = "toggle case";

        boolean hasLowercase = !str.equals(str.toUpperCase());

        if(hasLowercase) {
            String upperCaseString = str.toUpperCase();
            System.out.println(upperCaseString);
        } else {
            System.out.println("No conversion needed");
        }
    }
}
