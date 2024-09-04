package August_17_Assignment.Question_27;

public class ConvertingMinutesToHoursDemo {

    public static void main(String[] args) {

        int totalMinutes = 135;
        int hours = totalMinutes / 60;

        int minutes = totalMinutes % 60;
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}
