package lesson_03;

public class ForLoop {
    public static void main(String[] args) {
        int count = 0;
        for (; count < 3; count++ ){
            System.out.println("Pushing up ..." + (count + 1));
        }
        System.out.println(count); //3
    }
}
