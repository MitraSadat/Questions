package September_03_Assignment.stringMethods.substring.Question_10;

public class ReconstructingSentence {

    public static void main(String[] args) {

        String sentance = "Java is fun to learn";
        String subStr1 = sentance.substring(0, sentance.indexOf("fun"));

        int startIndex = sentance.indexOf("fun");
        String funStr = sentance.substring(startIndex, startIndex + 3);
        String toStr = sentance.substring(sentance.indexOf("to"), sentance.indexOf("to") + 2);
        String learnStr = sentance.substring(sentance.indexOf("learn"), sentance.length());
        String reorderSentance = learnStr + " " + toStr + " " + funStr + " " + subStr1;

        System.out.println(sentance);
        System.out.println(reorderSentance);








    }
}
