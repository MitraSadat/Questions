package August_17_Assignment.Question_21;

public class InterestCalculationDemo {

    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 5.5;
        int time = 2;
        int SimpleInterest = ((int)(principal * rate) * time) / 100;

        System.out.println("Simple Interest is : " + SimpleInterest);


    }
}
