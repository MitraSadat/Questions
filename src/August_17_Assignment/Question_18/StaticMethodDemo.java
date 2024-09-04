package August_17_Assignment.Question_18;

public class StaticMethodDemo {

    static int counter;

    static void incrementCounter(){
        counter++;
        System.out.println(counter);
    }

    public static void main(String[] args) {

        incrementCounter();
        incrementCounter();

    }
}
