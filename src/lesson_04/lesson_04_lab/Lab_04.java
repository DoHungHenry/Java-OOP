package lesson_04.lesson_04_lab;

import org.jetbrains.annotations.NotNull;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_04 {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(100);
        myArrayList.add(101);
        myArrayList.add(102);

        switch (getUserOption()){
            case 1:
                int randomNum = getRandomNum();
                System.out.println("Random Num is: " + randomNum);
                addNumToArrayList(randomNum, myArrayList);
                myArrayList.add(randomNum);
                System.out.println("Your added number: " + randomNum);
                break;
            case 2:
                printAllNumUnderArrayList(myArrayList);
                break;
            case 3:
                int maxNum = getMaxNum(myArrayList);
                System.out.printf("Max number of your ArrayList is: " + maxNum + "\n");
                break;
            case 4:
                int minNum = getMinNum(myArrayList);
                System.out.printf("Min number of your ArrayList is: " + minNum + "\n");
                break;
            default:
                System.out.println("Your choice not correct, please select one of 1, 2, 3, 4");
        }
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select option: ");
        return scanner.nextInt();
    }

    private static int getRandomNum() {
        return new SecureRandom().nextInt(10);
    }

    private static ArrayList<Integer> addNumToArrayList(int num, @NotNull ArrayList<Integer> arr) {
        arr.add(num);
        return arr;
    }

    private static void printAllNumUnderArrayList(@NotNull ArrayList<Integer> x) {
        for (Integer integer : x) System.out.println("Your ArrayList numbers: " + integer);
    }

    private static Integer getMaxNum(@NotNull ArrayList<Integer> arr) {
        int maxOfArrList = arr.get(0);

        for (Integer integer : arr) {
            if (integer > maxOfArrList) {
                maxOfArrList = integer;
            }
        }
        return maxOfArrList;
    }

    private static Integer getMinNum(ArrayList<Integer> arr) {
        int minOfArrList = arr.get(0);

        for (Integer integer : arr) {
            if (integer < minOfArrList) {
                minOfArrList = integer;
            }
        }
        return minOfArrList;
    }
}
