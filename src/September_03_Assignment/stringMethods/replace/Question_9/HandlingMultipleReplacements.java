package September_03_Assignment.stringMethods.replace.Question_9;

public class HandlingMultipleReplacements {

    public static void main(String[] args) {

        String str = "Java, Java, Java";
        String target = "Java";
        String replacement = "Python";
        String result;

        int firstIndex = str.indexOf(target);
        int secondIndex = str.indexOf(target, firstIndex + target.length());

        if (secondIndex != -1) {
            result = str.substring(0, secondIndex) + replacement + str.substring(secondIndex + target.length());
        } else {
            result = str;
        }

        System.out.println(result);

    }
}
