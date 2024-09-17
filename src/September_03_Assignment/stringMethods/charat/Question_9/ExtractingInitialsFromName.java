package September_03_Assignment.stringMethods.charat.Question_9;

public class ExtractingInitialsFromName {

    public static void main(String[] args) {

        String str = "John Doe";
        char firstInitial = str.charAt(0);
        char secondInitial = str.charAt(5);

        System.out.println(firstInitial + "." + secondInitial + ".");

    }
}
