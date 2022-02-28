package lesson_03.lesson_03_lab;

public class Lesson_03_lab_01 {
    public static void main(String[] args) {
        int[] Arr = {1,2,3,4,5};
        int even = 0;
        for (int i = 0; i < Arr.length; i++) {
            if ((Arr[i] % 2) == 0){
                even++;
            }
        }
        System.out.printf("Even numbers:" + even + "\n");

        int odd = 0;
        for (int i = 0; i < Arr.length; i++) {
            if ((Arr[i] % 2) != 0){
                odd++;
            }
        }
        System.out.printf("Odd numbers:" + odd + "\n");
    }
}
