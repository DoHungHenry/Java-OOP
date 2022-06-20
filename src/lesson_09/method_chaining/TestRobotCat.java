package lesson_09.method_chaining;

import static lesson_09.method_chaining.RobotCat.Builder;
import static lesson_09.method_chaining.RobotCat.robotCatList;

public class TestRobotCat {

    public static void main(String[] args) {
        Builder builder = new Builder();

        // Method Chaining
        RobotCat robotCat1 = builder.setAge(10).setName("Meo Mun").build();
        RobotCat robotCat2 = builder.setAge(20).setName("Meo Trang").build();
        RobotCat robotCat3 = builder.setAge(30).setName("Meo Vang").build();


        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat);
        }
    }
}
