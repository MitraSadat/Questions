package September_03_Assignment.stringMethods.trim.Question_8;

public class TrimmingAndReplacing {

    public static void main(String[] args) {

        String str = " Hello World ";
        String trimmedStr = str.trim();

        String result = trimmedStr.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
