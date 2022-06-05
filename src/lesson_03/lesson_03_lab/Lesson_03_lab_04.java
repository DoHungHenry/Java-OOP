package lesson_03.lesson_03_lab;

import java.util.Arrays;

public class Lesson_03_lab_04 {
    public static void main(String[] args) {

        int[] ArrA = {1, 12, 16, 28, 34};
        int[] ArrB = {1, 13, 16, 27, 99};
        int[] mergeArr = mergeSortedArrs(ArrA, ArrB);

        System.out.println(Arrays.toString(mergeArr));
    }

    public static int[] mergeSortedArrs(int[] a, int[] b){
        int aLength = a.length;
        int bLength = b.length;
        int[] Arr = new int[aLength + bLength];

        int aIndex = 0;
        int bIndex = 0;
        int mergeArrsIndex = 0;

        while (aIndex < aLength && bIndex < bLength){
            if (a[aIndex] < b[bIndex]){
                Arr[mergeArrsIndex++] = a[aIndex++];
            } else {
                Arr[mergeArrsIndex++] = b[bIndex++];
            }
        }

        while (aIndex < aLength){
            Arr[mergeArrsIndex++] = a[aIndex++];
        }

        while (bIndex < bLength){
            Arr[mergeArrsIndex++] = b[bIndex++];
        }
        return Arr;
    };
}
