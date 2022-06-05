package lesson_04;

public class ArrayPostFixPrefix {

    public static void main(String[] args) {

        int arrLength = 5;
        int[] myArr = new int[arrLength];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i+1;
        }

        for (int i : myArr) {
            System.out.print(i);
        }
    }
}
