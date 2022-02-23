package lesson_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        int sum = num1 + num2;
        System.out.println("Sum of num1 and num2 is " + sum);

        int product = num1 * num2;
        System.out.println("Product count: " + product);

        //phep chia: 5 / 2 = 2, 5 % 2 = 1
        int nguyen = 5/2;
        int remaining = 5%2;
        System.out.printf("%d chia %d = %d du %d \n", 5, 2, nguyen, remaining);

        //convention to bind correct type of variable
        // %b (boolean), %s (string), %d (so nguyen), %f (floating number)
        // print("string \n") => xuong dong voi \n
    }
}
