package September_03_Assignment.stringMethods.substring.Question_4;

public class FindingSubstringsWithinString {

    public static void main(String[] args) {

        String str = "OpenAI is awesome!";

        int firstIndex = str.indexOf("AI"); // it gives the start index --> 4

//      extracts the substring starting from index 4 up to index 6 (since the length of "AI" is 2).
        String subStr = str.substring(firstIndex, firstIndex+2);

        System.out.println(subStr);
    }
}
