package September_03_Assignment.stringMethods.tolowercase.Question_9;

public class DynamicCaseConversion {

    public static void main(String[] args) {

        String str = "Toggle CASE";

        boolean hasUppercase = !str.equals(str.toLowerCase());

        if(hasUppercase) {
            String lowerCaseString = str.toLowerCase();
            System.out.println(lowerCaseString);
        } else {
            System.out.println("No conversion needed");
        }
    }
}
