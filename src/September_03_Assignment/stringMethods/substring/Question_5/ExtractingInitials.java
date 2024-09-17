package September_03_Assignment.stringMethods.substring.Question_5;

public class ExtractingInitials {

    public static void main(String[] args) {

        String fullName = "John Doe";
        int space = fullName.indexOf(" ");

        String firstInitial = fullName.substring(0,1);
        String secondInitial = fullName.substring(space+1, space+2);

        System.out.println(firstInitial + secondInitial);


    }
}
