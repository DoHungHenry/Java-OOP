package lesson_05;

public class StringLearning {

    public static void main(String[] args) {

        //Literal Declaration  (put in the same position to string pool)
        String myName1 = "Teo";
        String myName2 = "Teo";

        //String Object Declaration (put "Teo" to a position in Java Heap storage, not in string pool)
        String myName3 = new String("Teo");

        System.out.println("myName1 == myName2: " + (myName1.equals(myName2)));
        System.out.println("myName1 == myName3: " + (myName1.equals(myName3)));

        // Verify that my password is correct or not: if it not include
        String myPassword = "123myPassword";

        //convert myPassword to an Arr characters
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalUpperCases = 0;
        int totalLowerCases = 0;

        for (char character : myCharacters) {
            //Use Wrapper Type to
            if (Character.isDigit(character)){
                totalDigits++;
            } else if (Character.isLowerCase(character)){
                totalLowerCases++;
            } else if (Character.isUpperCase(character)) {
                totalUpperCases++;
            }
        }

        if (totalDigits > 0 && totalLowerCases > 0 && totalUpperCases > 0){
            System.out.println("Your password is correct");
        } else {
            System.out.println("Your password is not correct");
        }


        // return true because this is comparison operator about the storage position
        //System.out.println("myName1 == myName2: " + (myName1 == myName2));

        // return false because it
        //System.out.println("myName1 == myName3: " + (myName1 == myName3));


    }
}
