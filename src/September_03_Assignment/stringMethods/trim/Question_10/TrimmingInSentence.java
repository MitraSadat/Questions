package September_03_Assignment.stringMethods.trim.Question_10;

public class TrimmingInSentence {

    public static void main(String[] args) {

        String str = " Java  is   awesome ";

        String result = str.trim().replaceAll("\\s+", " ");
        System.out.println(result);
    }
}
