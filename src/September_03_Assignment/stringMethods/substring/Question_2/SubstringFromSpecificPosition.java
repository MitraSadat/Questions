package September_03_Assignment.stringMethods.substring.Question_2;

public class SubstringFromSpecificPosition {

    public static void main(String[] args) {

        String str = "JavaDeveloper";

        int startIndex = str.indexOf("Developer");
        String result = str.substring(startIndex);

        System.out.println(result);
    }
}
