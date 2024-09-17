package September_03_Assignment.stringMethods.replace.Question_10;

public class ReplacingCharactersAtSpecificPositions {

    public static void main(String[] args) {

        String str = "abcdefghij";
        String result = str.replace(str.charAt(1), 'X');
        System.out.println(result);
    }
}
