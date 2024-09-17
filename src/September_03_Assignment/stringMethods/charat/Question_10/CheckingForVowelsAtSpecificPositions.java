package September_03_Assignment.stringMethods.charat.Question_10;

public class CheckingForVowelsAtSpecificPositions {

    public static void main(String[] args) {

        String str = "Umbrella";

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        String vowels = "AEIOUaeiou";

        boolean isFirstVowel = vowels.indexOf(firstChar) != -1;
        boolean isLastVowel = vowels.indexOf(lastChar) != -1;

        System.out.println(isFirstVowel && isLastVowel);




    }
}
