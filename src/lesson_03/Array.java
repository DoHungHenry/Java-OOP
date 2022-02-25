package lesson_03;

public class Array {
    public static void main(String[] args) {
        // index: [0,1,2,3,4]
        int[] intArr = new int[5];

        //assign value of index of array
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        // Print Last element of Arr
        System.out.println(intArr[intArr.length - 1]);

        // For loop apply on an Array
        // Calculate with an default array int[] Arr = new int[5]
        //
        // for (int elementIndex = 0;elementIndex < intArr.length;elementIndex++){
        //   intArr[elementIndex] = elementIndex++;
        //}
        // => 0 0 2 0 4




        for (int elementIndex = 0;elementIndex < intArr.length;elementIndex++){
            System.out.printf(String.valueOf(intArr[elementIndex]));
        }
        // intArr.for => code faster

        //default value of int array is always equal 0

    }
}
