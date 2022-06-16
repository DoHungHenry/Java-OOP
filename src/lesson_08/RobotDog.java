package lesson_08;

public class RobotDog {

    public static int dogId = 0;
    public String dogName = "Banh Mi";

    public void increaseDogId(){
        dogId++;
    }

    public static int getDogId() {
        // dogName can not be referred in this method because it's non-static
        // return dogName;

        // dogId can be referred in this method because it's static
        return dogId;
    }
}
