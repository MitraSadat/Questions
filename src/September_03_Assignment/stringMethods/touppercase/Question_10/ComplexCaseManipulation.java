package September_03_Assignment.stringMethods.touppercase.Question_10;

public class ComplexCaseManipulation {

    public static void main(String[] args) {

        String str = "AbCdEfGhIj";
        String convertedStr = str.toUpperCase();;

        for(int i = 3; i < str.length(); i+=4){
            convertedStr = convertedStr.replace(convertedStr.charAt(i), '*');
        }
        System.out.println(convertedStr);
    }
}
