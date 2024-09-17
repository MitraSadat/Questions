package September_03_Assignment.stringMethods.length.Question_9;

public class CountingSpecificCharacters {

    public static void main(String[] args) {

        String str = "abracadabra";
        String charStr = "a";

        System.out.println("Length of original string : " + str.length());

        String modifiedStr = str.replace(charStr, "");
        System.out.println("Length of string after removing character a : " + modifiedStr.length());

        int countA = str.length() - modifiedStr.length();
        System.out.println("Count of character a is :" + countA);
    }
}
