package lesson_07;

public class TestRobotCat {

    public static void main(String[] args) {

        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();

        batteryRobotCat.setName("meo chay pin");
        batteryRobotCat.setProductionDate("20220613");

        solarRobotCat.setName("meo nang luong mat troi");
        solarRobotCat.setProductionDate("20200101");

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
    }
}
