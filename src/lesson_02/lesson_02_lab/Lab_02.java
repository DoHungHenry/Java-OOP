package lesson_02.lesson_02_lab;

import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number: ");
        int myInt = scanner.nextInt();

        if ((myInt % 2) == 0) {
            System.out.printf("Your number is an Even number");
        } else {
            System.out.printf("Your number is an Odd number");
        }

    }
}
