package lesson_03.lesson_03_lab;
import java.util.Arrays;

public class Lesson_03_lab_03 {
    public static void main(String[] args) {

        int[] intArr = {12, 34, 1, 16, 28};

        int tempInt;

        //Bubble sort
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < intArr[i] ){
                    tempInt = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tempInt;
                }
            }

        }
        System.out.printf("Bubble sort: " + Arrays.toString(intArr) + "\n");

        // buildIn function: sort
        Arrays.sort(intArr);
        System.out.println("Build in function: " + Arrays.toString(intArr) + "\n");
    }
}
