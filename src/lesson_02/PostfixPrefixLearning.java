package lesson_02;

public class PostfixPrefixLearning {
    public static void main(String[] args) {
        /*
        * ++i; //prefix
        * --i;
        *
        * i++; //postfix
        * i--;
        * prefix first -> evaluate right operand, assign the result to the left operand -> postfix at the end
        *
        **/

        /*
        * Debug using breakpoint
        * */



        int num1 = 1;
        int num2 = 2;

        int result = ++num1 + num2++;
        // num1 = 2
        // result = 4
        // num2 = 3
    }
}
