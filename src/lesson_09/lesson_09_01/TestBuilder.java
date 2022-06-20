package lesson_09.lesson_09_01;

import static lesson_09.lesson_09_01.HouseWithBuilder.Builder;
import static lesson_09.lesson_09_01.HouseWithBuilder.houseList;

public class TestBuilder {

    public static void main(String[] args) {
        Builder builder1 = new Builder();
        builder1.setColor("Blue");
        builder1.setMainDoor(4);
        builder1.setWindow(8);
        // Init new object , this new object will be immutable object after initializing
        HouseWithBuilder house1 = builder1.build();

        Builder builder2 = new Builder();
        builder2.setMainDoor(1);
        builder2.setWindow(3);
        HouseWithBuilder house2 = builder2.build();

        for (HouseWithBuilder house : houseList) {
            System.out.println(house);
        }

    }
}
