package September_03_Assignment.stringMethods.contains.Question_6;

public class ConditionalSubstringCheck {

    public static void main(String[] args) {

        String str = "Data Science and AI";
        System.out.println(str.contains("Science"));

        String result = str.replace("Science", "Analysis");
        System.out.println(result);

    }
}
