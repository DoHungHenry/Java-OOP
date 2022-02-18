package lesson1;

// Naming Convention
// snake_case:
// camelCase
// normally, java will be named by camelCase, python will use snake_case
// Note: class name should be start with an uppercase letter => DataType

public class dataType {
    public static void main(String[] args) {
        //snake_case: my_byte
        byte myByte = 1;

        // Note: can not re-declare a variable, but can re-assign variable value
        // đôi khi không thể re-assign: const

        //final byte myByte2 = 2; // ko nen dat ten ntn
        // should be final byte MY_BYTE_2
        //myByte2 = 3;

        // print min max value of a byte var
        System.out.println(Byte.MAX_VALUE); //127
        System.out.println(Byte.MIN_VALUE); //-128

        short myShort = 0;
        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768

        float myFloat = 2.5f;

        double myDouble = 3.00000009;

        long myLong = 100L;
        boolean myBoolean = false;
        char myChar = 'A'; //nháy đơn: => true, nháy kép dành cho string
        char myUpperCase_ = 97;
        char myUpperCase_Q = 97;

        System.out.println(myUpperCase_);



    }
}
