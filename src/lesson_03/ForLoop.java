package lesson_03;

public class ForLoop {
    public static void main(String[] args) {
        int count = 0;
        for (; count < 3; count++ ){
            System.out.println("Pushing up ..." + (count + 1));
        }


        // Infinite Loop: happen when condition is always true
//        for (; count < 3;){
//            System.out.println("Pushing up ..." + (count + 1));
//        }

        // Interview: below code have any problem? => infinitive loop
//        for (;;){
//            System.out.println("Pushing up ..." + (count + 1));
//        }

        System.out.println(count); //3
    }
}
