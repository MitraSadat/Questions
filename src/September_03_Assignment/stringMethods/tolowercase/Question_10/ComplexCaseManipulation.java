package September_03_Assignment.stringMethods.tolowercase.Question_10;

public class ComplexCaseManipulation {

    public static void main(String[] args) {

        String str = "aBcDeFgHiJ";
        String convertedStr = str.toLowerCase();;

        for(int i = 2; i < str.length(); i+=3){
            convertedStr = convertedStr.replace(convertedStr.charAt(i), '*');
        }
        System.out.println(convertedStr);
    }
}
