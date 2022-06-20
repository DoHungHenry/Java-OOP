package lesson_09.lesson_09_01;

import java.util.ArrayList;
import java.util.List;

public class House2 {
    private String color = "White";
    private int mainDoor = 1;
    private int window = 2;
    private String topRoofColor = "Gray";
    private static List<House2> houseList2 = new ArrayList<>();

    public House2() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoor(int mainDoor) {
        this.mainDoor = mainDoor;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    @Override
    public String toString() {
        return "House2{" +
                "color='" + color + '\'' +
                ", mainDoor=" + mainDoor +
                ", window=" + window +
                ", topRoofColor='" + topRoofColor + '\'' +
                '}';
    }

    public static void main(String[] args) {

        House2 house2 = new House2();
        house2.setColor("Yellow");
        house2.setMainDoor(4);

        for (House2 house : houseList2) {
            System.out.println(house);
        }

    }
}
