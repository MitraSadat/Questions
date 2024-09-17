package September_03_Assignment.stringMethods.touppercase.Question_6;

public class CaseConversionAndReplacement {

    public static void main(String[] args) {

        String str = "text and more text";

        String result = str.toUpperCase().replaceAll("TEXT", "DATA");
        System.out.println(result);
    }
}
