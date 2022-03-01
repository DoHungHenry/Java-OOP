package lesson_03.lesson_03_lab;

public class Lesson_03_lab_02 {
    public static void main(String[] args) {
        int[] intArr = {5, 2, 5, 4, 8};

        int maxOfIntArr = intArr[0];
        int minOfInArr = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minOfInArr){
                minOfInArr = intArr[i];
            }
            if (intArr[i] > maxOfIntArr){
                maxOfIntArr = intArr[i];
            }
        }
        System.out.printf("Min number is: " + minOfInArr + "\n");
        System.out.printf("Max number is: " + maxOfIntArr + "\n");
    }
}
