package August_17_Assignment.Question_7;

public class TypeCastingDemo {

    public static void main(String[] args) {

        double doubleVar = 50.5;

        int intVar = (int) doubleVar;

        short shortVar = 45;
        doubleVar = shortVar;

        System.out.println("doubleVar = " + doubleVar + ", intVar = " + intVar + ", shortVar = " + shortVar);
    }
}
