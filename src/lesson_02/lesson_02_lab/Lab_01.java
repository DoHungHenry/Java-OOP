package lesson_02.lesson_02_lab;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.printf("Please enter your height: ");
        double height = scanner.nextDouble();

        DecimalFormat dF = new DecimalFormat("0.0");
        double BMI = weight / (height * height);
        double roundedBMI = Double.parseDouble(dF.format(BMI));

        System.out.printf("Your BMI is equal: " + roundedBMI + "\n");


        if (roundedBMI < 18.5){
            System.out.printf("You look quite thin, please add more nutrients to your meal.");
        } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9 ){
            System.out.printf("You will fit with all our clothes models, congrats.");
        } else if (roundedBMI >= 25 && roundedBMI <= 29.9){
            System.out.printf("You would be a lot prettier if you dropped a little weight.");
        } else {
            System.out.printf("Your BMI is too high, and should have a healthy meal from now on.");
        }

    }
}
