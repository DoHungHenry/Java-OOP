package lesson_02;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {

        //learn about BitwiseOperator
        //  &&  ||  : short-circuit
        // &  |  :
        // false && ...no perform..
        // false & null.length()
        // Best practice point: always check null first

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the name: ");

        String name = null;

        if (name != null & name.length() > 1){ // neu de 1 dau &, se xay ra nullpointerException
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }
    }
}
