package August_17_Assignment.Question_12;

public class StaticVariableDemo {

    static int counter;

    public static void main(String[] args) {

        counter = counter + 1;
        System.out.println(counter);

        StaticVariableDemo obj = new StaticVariableDemo();
        counter = counter + 1;
        System.out.println(counter);

    }
}
