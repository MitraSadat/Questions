package August_17_Assignment.Question_16;


public class InitializationBlockDemo {

    static int staticVar;
    int instanceVar;

    static {
        staticVar = 50;
    }
    {
        instanceVar = 25;
    }

    public static void main(String[] args) {

        System.out.println("Static variable : " + staticVar);

        InitializationBlockDemo obj = new InitializationBlockDemo();
        System.out.println("instance variable : " + obj.instanceVar);

    }
}
