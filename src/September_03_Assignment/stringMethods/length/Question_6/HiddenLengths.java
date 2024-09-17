package September_03_Assignment.stringMethods.length.Question_6;

public class HiddenLengths {

    public static void main(String[] args) {

        String str = "  Hello     ";
        // every space is counted in the length of string
        System.out.println("The length of string is : " + str.length());
        System.out.println("The length of string after trim is : " + str.trim().length());
    }
}
