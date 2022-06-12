package lesson_06.less_06_lab;

import java.util.Arrays;

public class Lesson06_lab03 {

    public static void main(String[] args) {

        String myStr = "100 minutes";

        char[] charMyStr = myStr.toCharArray();
        System.out.println(Arrays.toString(charMyStr));

        String digitInMyStr = "";
        for (char i : charMyStr) {
            if (Character.isDigit(i)){
                digitInMyStr = digitInMyStr + i;
            }
        }
        System.out.println(digitInMyStr);
    }
}
