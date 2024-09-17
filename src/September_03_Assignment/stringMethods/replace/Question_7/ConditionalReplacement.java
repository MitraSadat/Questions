package September_03_Assignment.stringMethods.replace.Question_7;

public class ConditionalReplacement {

    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        if(str.contains("fox")) str = str.replace("quick", "slow");

        System.out.println(str);
    }
}
