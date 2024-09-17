package September_03_Assignment.stringMethods.trim.Question_7;

public class CombiningTrimWithLengthCheck {

    public static void main(String[] args) {

        String str = " OpenAI ";
        String trimmedStr = str.trim();

        if(trimmedStr.length() > 5) System.out.println(true);
        else System.out.println(false);

    }
}
