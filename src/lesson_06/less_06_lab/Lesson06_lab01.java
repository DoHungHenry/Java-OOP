package lesson_06.less_06_lab;

public class Lesson06_lab01 {
    public static void main(String[] args) {

        String duration = "2hrs and 5 minutes";
        int hours = Integer.parseInt(duration.substring(0, 1));
        int minutes = Integer.parseInt(duration.substring(9, 10));

        int totalMinutes = hours * 60 + minutes;
        System.out.println("Total minutes of '2hrs and 5 minutes' string is equal " + totalMinutes + " minute(s)");
    }
}
