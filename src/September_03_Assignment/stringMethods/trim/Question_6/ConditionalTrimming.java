package September_03_Assignment.stringMethods.trim.Question_6;

public class ConditionalTrimming {

    public static void main(String[] args) {

        String str = " Welcome to Java ";
        String trimmedStr = str.trim();

        if(trimmedStr.startsWith("Welcome")) System.out.println("Yes it starts with welcome word.");
        else System.out.println("No it does not start with welcome word.");
    }
}
