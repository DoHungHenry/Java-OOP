package lesson_04.lesson_04_lab;

import org.jetbrains.annotations.NotNull;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(101);
        arr.add(102);

        switch (getUserOption()){
            case 1:
                int randomNum = getRandomNum(10);
                System.out.println("Random Num is: " + randomNum);
                addNumToArrayList(randomNum, arr);
                arr.add(randomNum);
                System.out.println("Your added number: " + randomNum);
                break;
            case 2:
                printAllNumUnderArrayList(arr);
                break;
            case 3:
                int maxNum = getMaxNum(arr);
                System.out.printf("Max number of your ArrayList is: " + maxNum + "\n");
                break;
            case 4:
                int minNum = getMinNum(arr);
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

    private static int getRandomNum(int num) {
        return new SecureRandom().nextInt(num);
    }

    private static ArrayList<Integer> addNumToArrayList(int num, @NotNull ArrayList<Integer> arr) {
        arr.add(num);
        return arr;
    }
    private static void printAllNumUnderArrayList(@NotNull ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println("Your ArrayList numbers: " + x.get(i));
        }
    }
    private static Integer getMaxNum(@NotNull ArrayList<Integer> arr) {
        int maxOfArrList = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxOfArrList){
                maxOfArrList = arr.get(i);
            };
        }
        return maxOfArrList;
    }
    private static Integer getMinNum(ArrayList<Integer> arr) {
        int minOfArrList = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < minOfArrList){
                minOfArrList = arr.get(i);
            };
        }
        return minOfArrList;
    }
}
