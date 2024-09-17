package September_03_Assignment.stringMethods.charat.Question_7;

public class ReversingAStringManually {

    public static void main(String[] args) {

        String str = "Python";

        for ( int i = str.length() - 1; i >= 0; i-- ){
            System.out.println(str.charAt(i));
        }

    }
}
