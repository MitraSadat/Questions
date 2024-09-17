package September_03_Assignment.stringMethods.replace.Question_6;

public class MultipleReplacements {

    public static void main(String[] args) {

        String str = "She sells sea shells by the sea shore";
        str = str.replaceAll("sea", "ocean");
        str = str.replaceAll("shells", "stones");
        System.out.println(str);

    }
}
