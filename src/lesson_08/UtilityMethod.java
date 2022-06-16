package lesson_08;

public class UtilityMethod {

    public static int findMinNum(int[] arr){
        return 0;
    }

    public int findMaxNum(int[] ints){
        return 0;
    }

    public static void main(String[] args) {
        // we can call class method to re-use logic directly without initiate new object
        UtilityMethod.findMinNum(new int[]{});

        // we can't call class method to re-use logic directly without initiate new object
        // UtilityMethod.findMaxNum(new int[]{});
        // Need to initiate new object from class because findMaxNum() isn't static
        new UtilityMethod().findMaxNum(new int[]{});
    }

    
}
