package lesson_02.lesson_02_lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight;
        do {
            System.out.println("Please enter your weight: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter correct your weight again (decimal places accepted): ");
                scanner.next();
            }
            weight = scanner.nextDouble();
        } while (weight <= 0);

        double height;
        do {
            System.out.println("Please enter your height: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Please enter correct your height again (decimal places accepted): ");
                scanner.next();
            }
            height = scanner.nextDouble();
        } while (height <= 0);


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
