package lesson_09.lesson_09_01;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String color = "White";
    private int mainDoor = 1;
    private int window = 2;
    private String topRoofColor = "Gray";
    private static List<House> houseList = new ArrayList<>();

    public House(String color, int mainDoor, int window, String topRoofColor) {
        if (color != null) {
            this.color = color;
        }
        if (mainDoor >=1) {
            this.mainDoor = mainDoor;
        }
        if (window >=1) {
            this.window = window;
        }
        if (topRoofColor != null) {
            this.topRoofColor = topRoofColor;
        }
        houseList.add(this);
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", window=" + window +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static void main(String[] args) {

        // make other dev confuse with 2 int value
        House house1 = new House(null, 2, 4, "blue");
        House house2 = new House("Red", 5, 6,null);

        for (House house : houseList) {
            System.out.println(house);
        }
    }
}
