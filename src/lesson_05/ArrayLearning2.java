package lesson_05;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            if (!arrWithoutDuplicatedValue.contains(i)){
                arrWithoutDuplicatedValue.add(i);
            }
        }

        System.out.println(myArrList);
        System.out.println(arrWithoutDuplicatedValue);

        Set<Integer> set = new HashSet<>(myArrList);
        System.out.println(set);

        List<Integer> changeSetToList = new ArrayList<>(set);
        System.out.println(changeSetToList);

        //Get a SubArrList
        List<Integer> get3FirstIndex = changeSetToList.subList(0,3);
    }
}
