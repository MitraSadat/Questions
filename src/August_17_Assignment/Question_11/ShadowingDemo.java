package August_17_Assignment.Question_11;

public class ShadowingDemo {

    String name = "Class Level";

    public static void main(String[] args) {

        String name = "Local Level";

        System.out.println("Name value: " + name);

        ShadowingDemo obj = new ShadowingDemo();
        System.out.println("Class Level value: " + obj.name);

    }
}
