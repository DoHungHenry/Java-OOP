package lesson_02;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean isHeOnTime = true;
        int hour = -1;

        if (isHeOnTime){
            hour = 7;
        }

        //Ternary Operator (toán tử ba ngôi)

        int hour = isHeOnTime ? 7 : -1;

        System.out.println(hour);
    }
}
