package lesson_06;

public class Calculator {

    // Method overloading
//    public int sum(int a, int b){
//        return a +b;
//    }
//    public int sum(int a, int b, int c){
//        return a + b + c;
//    }

    // InJava: know as VarAgrs | InJavaScript: Rest Parameters
//    public int sum(int a, int b, int... numbers){ // numbers is an array
//        int arrTotal = 0;
//        for (int number : numbers) {
//            arrTotal = arrTotal + number;
//        }
//        return a + b + arrTotal;
//    }

    public int sum(int... numbers){ // numbers is an array
        int arrTotal = 0;
        for (int number : numbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        System.out.println(calculator.sum(1, 2, 3, 4));
        System.out.println(calculator.sum(1, 2, 3, 4, 5));
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6));
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7));
    }
}
