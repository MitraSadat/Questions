package September_03_Assignment.stringMethods.contains.Question_8;

public class CheckingForSubstringInUserInput {

    public static void main(String[] args) {

        String user_input = "I love programming in Java";

        if(user_input.contains("Java")) System.out.println("User is interested in Java");
        else System.out.println("User is interested in something else");
    }
}
