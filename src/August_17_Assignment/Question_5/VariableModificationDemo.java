package August_17_Assignment.Question_5;

public class VariableModificationDemo {

    public static void main(String[] args) {

        int num = 10;
        String greeting = "Hello";

        num = 20;
        greeting = greeting + "World";

        System.out.println(num + " , " + greeting);
    }
}
