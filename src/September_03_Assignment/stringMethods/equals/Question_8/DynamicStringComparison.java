package September_03_Assignment.stringMethods.equals.Question_8;

public class DynamicStringComparison {

    public static void main(String[] args) {

        String str = "OpenAI";
        String userInput = "openai";

        boolean isEqual = str.equals(userInput);

        if(isEqual) System.out.println("Strings match exactly");
        else System.out.println("Strings do not match exactly");    }
}
