package lesson_02;

public class MultipleIfElse {
    public static void main(String[] args) {
        //---true--|---false--
        //---not sell--|---18->50--unlimited--|--not sell

        int age = 0;
        if (age < 18) {
            System.out.println("not enough age, no sell");
        } else if(age >= 18) {
            System.out.println("sell unlimited");
        } else {
            System.out.println("too old");
        }
    }
}
