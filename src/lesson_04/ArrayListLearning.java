package lesson_04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {
        //ArrayList implements interface List
//        ArrayList myList = new ArrayList();
//        myList.add("example");
//        myList.add(2);
//        myList.add(true);

        //Draw type
        List<Integer> myList = new ArrayList<>();
        myList.add(0);
        myList.add(1, 2);
        myList.add(0, 3);

        //truy cập index
//        for (int i = 0; i < myList.size(); i++) {
//            // this below is  correct with array
//            //myList[i];
//
//            //this below is correct with ArrayList
//            System.out.println(myList.get(i));
//        }

        //No Access Index value, just read & get
//        for (Integer integer : myList) {
//            System.out.println(integer);
//        }

        //set value for an index position
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) == 0){
                myList.set(i, myList.get(i)+1);
            }
            System.out.println(myList.get(i));
        }
    }
}
