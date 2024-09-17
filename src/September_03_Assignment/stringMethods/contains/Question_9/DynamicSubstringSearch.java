package September_03_Assignment.stringMethods.contains.Question_9;

public class DynamicSubstringSearch {

    public static void main(String[] args) {

        String msg = "The quick brown fox jumps over the lazy dog";
        String userInput = "fox";

        if (msg.contains(userInput)) System.out.println("substring found");
        else System.out.println("substring not found.");

    }
}
