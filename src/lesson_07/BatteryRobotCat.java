package lesson_07;

//Sub-Class or child class
//IS-A relationship
public class BatteryRobotCat extends RobotCat {

    @Override
    public String charge() {
        return super.charge().concat("with battery energy");
    }
}
