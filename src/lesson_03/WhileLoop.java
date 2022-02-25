package lesson_03;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // check A condition => true => run B body
        // Back to A condition, check again

        // Minigame: đoán số từ 0-7,
        // số lần đoán tối đa là 3
        // sai: nhập số tiếp
        // đúng: chúc mừng
        // limit số lần đoán: see u next time
        boolean isAnswerRight = false;
        int guessTime = 0;
        final int MAXIMUM_GUESS_TIME = 3;

        // đảo ngược giá trị với !
        while (!isAnswerRight && guessTime < MAXIMUM_GUESS_TIME){
            // User can play
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input number: ");
            int userInput = scanner.nextInt();

            if (userInput == 7){
                isAnswerRight = true;
                System.out.println("Hooray");
            } else {
                guessTime++;
            }
        }
        if (guessTime == MAXIMUM_GUESS_TIME){
            System.out.println("See you next time");
        }

        // When using While: put only condition into LOOP, other will put outside
    }
}
