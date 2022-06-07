package lesson_05;

import java.util.ArrayList;

public class ArrayListLearning {

    public static void main(String[] args) {

        ArrayList<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        myArrList.add(4);

        //Biến đổi toàn bộ số lẻ trong ArrList thành số chẵn
        for (int i = 0; i < myArrList.size(); i++) {
            int currentNum = myArrList.get(i);

            if (currentNum %2 != 0){
                myArrList.set(i, currentNum +1);
            }
        }
        System.out.println(myArrList);

        // Remove all values from all index which has the same index value
        int arrSize = myArrList.size();
        for (int i = 0; i < arrSize; i++) {
            int currentNum = myArrList.get(i);

            if (currentNum == 4) {
                myArrList.remove(Integer.valueOf(4));
                arrSize--;
                i--;
            }
        }
        System.out.println(myArrList);
    }
}
