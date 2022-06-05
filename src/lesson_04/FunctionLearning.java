package lesson_04;

public class FunctionLearning {
    public static void main(String[] args) {

//        sayHello("Ti");
//        sayHello("Teo");

        printNum();
    }

//    public static void sayHello(String name){
//        System.out.println("Hello " + name);
//    }

    //Distinguish return & break
    // return: stop all functions in printNum & exit
    // break: exit loop;
    public static void printNum(){
        for (int i = 0; i < 5; i++) {
            if (i == 2){
                return;
            }
            System.out.println(i);
        }
        System.out.println("End");
    }
}
