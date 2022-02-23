package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //---true--|---false--
        //---not sell--|---18->50--unlimited--|--2 wine can

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        // redundant: line 17: age >= 18
        if (age < 18) {
            System.out.println("not enough age, no sell");
        } else if(age <= 50) {
            System.out.println("sell unlimited");
        } else {
            System.out.println("2 can");
        }

        //distinguish & va | : bitwise Operator
    }
}
