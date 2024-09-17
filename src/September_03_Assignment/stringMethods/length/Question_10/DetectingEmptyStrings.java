package September_03_Assignment.stringMethods.length.Question_10;

public class DetectingEmptyStrings {

    public static void main(String[] args) {

        String str = "";

        if(str.length() == 0) System.out.println("The string is empty!");
        str += " ";
        System.out.println("The length of a string with an space is : " + str.length());
    }
}
