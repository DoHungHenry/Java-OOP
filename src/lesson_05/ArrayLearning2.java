package lesson_05;

import java.util.ArrayList;
import java.util.List;

public class ArrayLearning2 {

    public static void main(String[] args) {

        ArrayList<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);

        List<Integer> arrWithoutDuplicatedValue = new ArrayList<>();
        for (Integer i : myArrList) {
            if (arrWithoutDuplicatedValue.contains(i)){
                arrWithoutDuplicatedValue.add(i);
            }
        }

        System.out.println(myArrList);
        System.out.println(arrWithoutDuplicatedValue);
    }
}
