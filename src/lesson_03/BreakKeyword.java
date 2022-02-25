package lesson_03;

public class BreakKeyword {
    public static void main(String[] args) {
        int[] intArr = {2,34,13,67,34};

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 34){
                System.out.printf("the number %d is index %d of Array \n", 34, i);
                break;
            }
        }
    }
}
