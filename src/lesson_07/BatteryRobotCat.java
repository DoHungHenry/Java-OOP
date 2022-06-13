package lesson_07;

public class BatteryRobotCat extends RobotCat {

    @Override
    public String charge() {
        return super.charge().concat("with battery energy");
    }
}
