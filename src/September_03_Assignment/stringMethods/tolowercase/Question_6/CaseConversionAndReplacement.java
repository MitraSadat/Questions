package September_03_Assignment.stringMethods.tolowercase.Question_6;

public class CaseConversionAndReplacement {

    public static void main(String[] args) {

        String str = "TeXT aND mORe TeXT";

        String result = str.toLowerCase().replaceAll("text", "data");
        System.out.println(result);
    }
}
