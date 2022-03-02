package lesson_03.lesson_03_lab;

import lesson_03.Array;

import java.util.Arrays;

public class Lesson_03_lab_03 {
    public static void main(String[] args) {

        //sort min to max
        int[] intArr = {12, 34, 1, 16, 28};

        int tempInt;

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < intArr[i]){
                    tempInt = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = tempInt;
                }
            }
        }
        System.out.printf(Arrays.toString(intArr));

        // Research
        // way 1: nested for (bubble sort)
//        int[] arr = new int[] { 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int tmp = 0;
//                if (arr[i] > arr[j]) {
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }

        // way 2: while loop
        // orderedNums[greater]=tenNums[indexL];
        // while (orderedNums[greater] == tenNums[indexL]) {
        //     greater++;
        // }
        // orderedNums[greater] = tenNums[indexL];

        // way 3: buildIn function: sort
        // import: import java.util.Arrays;
        // Arrays.sort( array )

        // way 4: Selection sort
        // int x[] = { 10, 30, 15, 69, 52, 89, 5 };
        //    int max, temp = 0, index = 0;
        //    for (int i = 0; i < x.length; i++) {
        //        int counter = 0;
        //        max = x[i];
        //        for (int j = i + 1; j < x.length; j++) {
        //
        //            if (x[j] > max) {
        //                max = x[j];
        //                index = j;
        //                counter++;
        //            }
        //
        //        }
        //        if (counter > 0) {
        //            temp = x[index];
        //            x[index] = x[i];
        //            x[i] = temp;
        //        }
        //    }
        //    for (int i = 0; i < x.length; i++) {
        //        System.out.println(x[i]);
        //    }
    }
}
