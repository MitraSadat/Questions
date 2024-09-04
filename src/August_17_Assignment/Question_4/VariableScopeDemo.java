package August_17_Assignment.Question_4;
import August_17_Assignment.Question_1.VariableDemo;

import java.util.Scanner;

public class VariableScopeDemo {

    static String globalVar = "Global";

    public static void printVariables(){

        System.out.println("Global Variable: " + globalVar);
    }

    public static void main(String[] args) {

        String localVar = "Local";

        printVariables();
        System.out.println("Local Variable: " + localVar);

    }
}
