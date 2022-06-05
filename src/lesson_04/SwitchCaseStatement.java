package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your selection: ");
        int inputNum = scanner.nextInt();

//        switch (inputNum){
//            case 1:
//                System.out.println("1st");
//                break;
//            case 2:
//                System.out.println("2nd");
//                break;
//            case 3:
//                System.out.println("3rd");
//                break;
//            default:
//                System.out.println("Good luck in the next time");
//        }

        switch (inputNum){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekdays");
                break;
            case 7:
            case 8:
                System.out.println("weekends");
                break;
            default:
                System.out.println("It's not a day in a week");
        }

    }
}
