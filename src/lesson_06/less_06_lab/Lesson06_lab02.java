package lesson_06.less_06_lab;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson06_lab02 {

    public static void main(String[] args) {

        String myPassword = "password123";
        int userInputTimes = 1;

        while (userInputTimes < 4){
            String inputPassword = getUserPassword();
            userInputTimes++;
            if (inputPassword.equals(myPassword)){
                System.out.println("Your password is correct, please wait to redirect to home page");
            } else if (userInputTimes == 2 || userInputTimes == 3){
                System.out.println("Your password isn't correct, please try again");
            } else {
                System.out.println("Your input times is finish, so then your account is locked, please contact us to unlock");
            }
        }
    }

    private static String getUserPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your password: ");
        return scanner.next();
    }
}
