package September_03_Assignment.stringMethods.substring.Question_8;

public class FindingOverlappingSubstrings {

    public static void main(String[] args) {

        String str = "bananas";
        int startIndex = str.indexOf("ana");
        System.out.println("Start index : " + startIndex);
        String subStr = str.substring(startIndex, startIndex + 3);
        System.out.println(subStr);

    }
}
