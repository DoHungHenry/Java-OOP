package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotCatController {

    public static void main(String[] args) {
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat batteryRobotCat = new BatteryRobotCat();

        RobotCatController robotCatController = new RobotCatController();
        robotCatController.chargeRobotCat(Arrays.asList(solarRobotCat, batteryRobotCat));
    }

    public void chargeRobotCat(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
