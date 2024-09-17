package September_03_Assignment.stringMethods.replace.Question_8;

public class ReplacingSpecificCharacters {

    public static void main(String[] args) {

        String str = "password123";
        System.out.println(str.replaceAll("\\d", "*"));

    }
}
