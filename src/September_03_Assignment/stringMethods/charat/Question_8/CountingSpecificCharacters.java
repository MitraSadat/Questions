package September_03_Assignment.stringMethods.charat.Question_8;

public class CountingSpecificCharacters {

    public static void main(String[] args) {

        String str = "Mississippi";
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 's') count+= 1;
        }
        System.out.println("Total character 's' count is : " + count);
    }
}
