package August_17_Assignment.Question_1;

public class VariableDemo {

    static int classLevelVar = 10;
    String instanceVar = "Hello";

    public static void main(String[] args) {

        double localVar = 20.5;

        localVar = 30.5;

        System.out.println("Local variable: " + localVar);

        VariableDemo obj = new VariableDemo();
        System.out.println("Instance Variable: " + obj.instanceVar);

        System.out.println("Class Level Variable: " + classLevelVar);

    }
}
