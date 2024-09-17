package September_03_Assignment.stringMethods.length.Question_7;

public class LengthComparison {

    public static void main(String[] args) {

        String str1 = "Hello", str2 = "World";

        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length > str2Length) System.out.println(str1 + " is longer then " + str2);
        else if (str1Length < str2Length) System.out.println(str2 + " is longer then " + str1);
        else System.out.println("The length of the both strings are equal.");
    }
}
