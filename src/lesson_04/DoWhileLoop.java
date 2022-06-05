package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        int guessTimes = 10;
        int randomNum = new SecureRandom().nextInt(11);
        System.out.println("RandomNum is " + randomNum);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your guess number: ");
            int inputNum = scanner.nextInt();

            if (inputNum == randomNum){
                System.out.println("Congratulation!");
                break;
            } else {
                System.out.println("Your guessing times is " + guessTimes-- + " left");
            }

            guessTimes++;
        } while (guessTimes < 10);
    }
}
