package lesson_08;

public class TestRobotDog {

    public static void main(String[] args) {
        RobotDog bi = new RobotDog();
        bi.increaseDogId();
        //equal 1
        System.out.println(bi.getDogId());

        RobotDog ben = new RobotDog();
        ben.increaseDogId();

        //equal 2
        System.out.println(bi.getDogId());
        //equal 2
        System.out.println(ben.getDogId());
    }
}
