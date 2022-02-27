package lesson_02.lesson_02_lab;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.printf("Please enter your Weight: ");
            double weight = scanner.nextDouble();
            System.out.printf("Please enter your Height: ");
            double height = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Please enter only number: ");
        }

//





    }
}
